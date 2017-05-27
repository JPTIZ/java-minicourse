import java.util.Scanner;

public class BattleScene {
    public BattleScene(Game game, int enemyenemiesId) {
        this.game = game;
        generateEnemyenemies(enemyenemiesId);
    }

    public void generateEnemyenemies(int id) {
        switch (id) {
            case 0:
                enemies = new Enemy[] {
                    new Enemy(
                            "Slime",
                            10,
                            10,
                            10,
                            3
                    ),
                };
                break;
            case 1:
                enemies = new Enemy[] {
                    new Enemy(
                            "Slime A",
                            10,
                            10,
                            10,
                            3
                    ),
                    new Enemy(
                            "Slime B",
                            10,
                            10,
                            10,
                            3
                    ),
                    new Enemy(
                            "Slime C",
                            10,
                            10,
                            10,
                            3
                    ),
                };
                break;
            case 2:
                enemies = new Enemy[] {
                    new Enemy(
                            "Ogre A",
                            40,
                            22,
                            17,
                            8
                    ),
                    new Enemy(
                            "Slime A",
                            10,
                            10,
                            10,
                            3
                    ),
                    new Enemy(
                            "Slime B",
                            10,
                            10,
                            10,
                            3
                    ),
                };
                break;
            case 3:
                enemies = new Enemy[] {
                    new Enemy(
                            "Scorpion A",
                            17,
                            17,
                            8,
                            7
                    ),
                    new Enemy(
                            "Scorpion B",
                            17,
                            17,
                            8,
                            7
                    ),
                    new Enemy(
                            "Slime",
                            10,
                            10,
                            10,
                            3
                    ),
                };
                break;
        }
    }

    public void start() {
        for (Enemy enemy: enemies) {
            System.out.printf("%s, ", enemy.getName());
        }
        System.out.println("apareceram! Prepare-se para a batalha!\n");

        int currentHero = 0;
        Scanner reader = new Scanner(System.in);
        Hero[] heroes = game.getHeroes();

        while (true) {
            Hero hero = heroes[currentHero];

            // Se o herói está morto, ele não pode agir. Então pulamos para o
            // próximo herói.
            if (hero.isDead()) {
                currentHero++;
                System.out.printf(
                        "%s está nocauteado e não pode agir.\n", hero.getName()
                );
                if (currentHero == heroes.length) {
                    System.out.println("Você perdeu. Fim de jogo.");
                    System.exit(0);
                }
                continue; // "continue" pula para a próxima iteração do `while`
            }

            // É necessário que o herói, caso estava defendendo antes, pare de
            // defender, afinal é um novo turno
            hero.setDefending(false);

            System.out.printf(
                    "%s, escolha uma ação:\n" +
                    "1. Atacar\n" +
                    "2. Defender\n" +
                    "3. Ver status\n" +
                    "4. Fugir\n" +
                    "Resposta: ",
                    hero.getName()
            );

            int action = reader.nextInt();

            if (action == 1) {
                // A ação escolhida foi "Atacar"
                int target = selectTarget();

                Enemy enemy = enemies[target];

                enemy.applyDamage(hero.getAttack());

                System.out.printf("%s atacou %s!\n", hero.getName(), enemy.getName());
                if (enemy.isDead()) {
                    System.out.printf("%s foi nocauteado!\n", enemy.getName());
                } else {
                    System.out.printf(
                            "%s está com %d pontos de vida.\n\n",
                            enemy.getName(), enemy.getHealth()
                    );
                }

                if (isAllEnemiesDead()) {
                    System.out.println("Todos os inimigos foram derrotados!");

                    giveExperiencesToParty();
                    return;
                }

                currentHero++; // Avança para o próximo herói
            } else if (action == 2) {
                // A ação escolhida foi "Defender"
                hero.setDefending(true);
                currentHero++; // Avança para o próximo herói
            } else if (action == 3) {
                // A ação escolhida foi "Ver status"
                System.out.println(
                        "| Nome                 | Vida/Max  |\n" +
                        "|----------------------|-----------|"
                );
                System.out.printf(
                        "| %20s | %4d/%4d |",
                        hero.getName(),
                        hero.getHealth(),
                        hero.getMaxHealth()
                );
            } else if (action == 4) {
                // A ação escolhida foi "Fugir"
                System.out.println("Você fugiu da batalha!");
                return; // Sai da batalha
            }

            System.out.println();

            if (currentHero >= heroes.length) {
                System.out.println();
                System.out.println("---------------------");
                System.out.println("| Vez dos inimigos! |");
                System.out.println("---------------------");
                System.out.println();
                enemiesTurn();
                System.out.println();
                System.out.println("-------------------");
                System.out.println("| Vez dos heróis! |");
                System.out.println("-------------------");
                System.out.println();
                currentHero = 0; // Volta para o primeiro herói
            }

            System.out.println();
        }
    }

    /**
     * Pede ao usuário para selecionar um atributo.
     */
    private int selectTarget() {
        Scanner reader = new Scanner(System.in);

        System.out.println();
        while (true) {
            System.out.println("Selecione um alvo:");
            for (int i = 0; i < enemies.length; i++) {
                if (!enemies[i].isDead()) {
                    System.out.printf("%d: %s\n", i, enemies[i].getName());
                }
            }
            System.out.print("Resposta: ");

            int target = reader.nextInt();
            if (target < 0 || target >= enemies.length || enemies[target].isDead()) {
                System.out.println("Alvo inválido.");
            } else {
                System.out.println();
                return target;
            }
        }
    }

    /**
     * Executa o turno dos inimigos.
     */
    private void enemiesTurn() {
        Hero[] heroes = game.getHeroes();

        for (Enemy enemy: enemies) {
            if (enemy.isDead()) {
                // Quem está nocauteado não pode agir, então pula para a
                // próxima iteração
                continue;
            }
            // Seleciona um herói aleatório para atacar
            int target = (int)(Math.random() * heroes.length);

            Hero hero = heroes[target];
            hero.applyDamage(enemy.getAttack());

            System.out.printf(
                    "%s atacou %s!\n",
                    enemy.getName(), hero.getName()
            );

            if (hero.isDead()) {
                System.out.printf("%s foi nocauteado!\n", hero.getName());
            } else {
                System.out.printf(
                        "%s está com %d pontos de vida.\n",
                        hero.getName(), hero.getHealth()
                );
            }

            System.out.println();
        }
    }

    private boolean isAllEnemiesDead() {
        // Procuramos pelo primeiro inimigo que não está nocauteado
        for (Enemy enemy: enemies) {
            if (!enemy.isDead()) {
                return false; // Para o `for` já no primeiro não-nocauteado
            }
        }
        // Se o `for` terminou, ninguém estava nocauteado
        return true;
    }

    private void giveExperiencesToParty() {
        int exp = 0;
        for (Enemy enemy: enemies) {
            exp += enemy.getExpGiven();
        }

        for (Hero hero: game.getHeroes()) {
            hero.giveExp(exp);
        }
    }

    private Game game;
    private Enemy[] enemies;
}
