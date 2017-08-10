import java.util.Scanner;

public class Adventure {
    public Adventure(Game game) {
        this.game = game;
    }

    public void start() {
        Scanner reader = new Scanner(System.in);
        int option = 0;
        while (option != 4) {
            System.out.println(
                    "O que você deseja fazer?\n" +
                    "1. Caçar monstros\n" +
                    "2. Dormir no hotel\n" +
                    "3. Ver status da equipe\n" +
                    "4. Finalizar aventura"
            );

            option = reader.nextInt();

            switch (option) {
                case 1:
                    hunt();
                    break;
                case 2:
                    sleep();
                    break;
                case 3:
                    checkStatus();
                    break;
                case 4:
                    System.out.printf(
                            "Foi bom conhecê-lo, %s. Até a próxima aventura.\n",
                            game.getHeroes()[0].getName()
                    );
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public void hunt() {
        int enemyGroupId = (int)(Math.random() * 4);

        BattleScene battle = new BattleScene(game, enemyGroupId);
        battle.start();
    }

    public void sleep() {
        for (Hero hero: game.getHeroes()) {
            hero.resurrect();
            hero.heal(hero.getMaxHealth());
        }
        System.out.println("Os heróis foram completamente curados.");
    }

    public void checkStatus() {
        System.out.println(
                "| Nome                 | LV | Vida/Max  | Ataque | Defesa | Experiência | Próx. Nível |\n" +
                "|----------------------|----|-----------|--------|--------|-------------|-------------|"
        );
        for (Hero hero: game.getHeroes()) {
            System.out.printf(
                    "| %20s | %2d | %4d/%4d | %6d | %6d | %11d | %11d |\n",
                    hero.getName(),
                    hero.getLevel(),
                    hero.getHealth(),
                    hero.getMaxHealth(),
                    hero.getAttack(),
                    hero.getDefense(),
                    hero.getExp(),
                    hero.getNeededExp()
            );
        }
    }

    private Game game;
}
