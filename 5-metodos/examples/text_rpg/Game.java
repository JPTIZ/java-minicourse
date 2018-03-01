import java.util.Scanner;

public class Game {
    public Game() {
        this.heroes = new Hero[] {
            null, // Isso é uma má ideia na verdade, mas será mantida porque
                  // não vismo ainda vetores de tamanho dinâmico.
            new Hero("O Bardo",
                    50, 8,
                    33, 17,
                    6, 1,
                    17, 2
            ),
            new Hero("O Guerreiro",
                    20, 2,
                    18, 12,
                    19, 4,
                    7, 1
            ),
        };
    }

    public void start() {
        System.out.print(
                "Bem-vindo ao mundo mágico de Java.\n" +
                "Este é um mundo perigoso onde terríveis criaturas moram.\n" +
                "Você estaria preparado para enfrentar o que há por vir?\n" +
                "S/N: "
        );

        var reader = new Scanner(System.in);
        while (true) {
            var answer = reader.nextLine();
            if (answer.equals("S")) {
                break;
            } else if (answer.equals("N")) {
                System.out.println(
                        "Ora, é uma pena.\n" +
                        "Apenas os valentes podem viver aqui. Adeus.");
                return;
            } else {
                System.out.println(
                        "Opção inválida. Apenas \"S\" ou \"N\" são permitidos.");
            }
        }
        System.out.print(
                "Foi uma sábia decisão. Qual o seu nome, jovem gafanhoto?\n" +
                "Resposta: "
        );

        this.heroes[0] =
            new Hero(reader.nextLine(),
                    30, 3,
                    20, 15,
                    15, 3,
                    13, 2
            );

        System.out.printf(
                "Seja bem-vindo, %s.\n", heroes[0].getName()
        );

        var adventure = new Adventure(this);
        adventure.start();
    }

    public Hero[] getHeroes() {
        return heroes;
    }

    private Hero[] heroes;
}
