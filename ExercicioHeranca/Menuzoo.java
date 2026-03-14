package ExercicioHeranca;
import java.util.Scanner;

public class Menuzoo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Zoo zoo = new Zoo();
        int op = 0;

        while (op != 6) {
            System.out.println("\n ---- MENU ZOO ----");
            System.out.println("1. Add animal");
            System.out.println("2. Listar todos animais");
            System.out.println("3. Remover animal (por ID)");
            System.out.println("4. Emitir som de um animal");
            System.out.println("5. Testar habilidade de um animal");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            op = s.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Escolha o tipo:");
                    System.out.println("1 - Cat");
                    System.out.println("2 - Dog");
                    System.out.println("3 - Bird");

                    int type = s.nextInt();

                    System.out.print("ID: ");
                    long id = s.nextLong();

                    System.out.print("Idade: ");
                    int idade = s.nextInt();

                    System.out.print("Peso: ");
                    double peso = s.nextDouble();

                    Animal animal = null;

                    if (type == 1) {
                        animal = new Gato(id, idade, peso);
                    } else if (type == 2) {
                        animal = new Cachorro(id, idade, peso);
                    } else if (type == 3) {
                        animal = new Passaro(id, idade, peso);
                    }

                    zoo.addAnimal(animal);
                    System.out.println("Animal adicionado!");
                    break;

                    case 2:

                    for (Animal a : zoo.listAnimals()) {
                        System.out.println(a.getId() + " - " + a.getNome());
                    }
                    break;

                case 3:

                    System.out.print("Digite o ID para remover: ");
                    long removeId = s.nextLong();

                    boolean removed = zoo.removeAnimal(removeId);

                    System.out.println("Animal removido: " + removed);
                    break;

                case 4:

                    System.out.print("Digite o ID: ");
                    long somId = s.nextLong();

                    for (Animal a : zoo.listAnimals()) {
                        if (a.getId() == somId) {
                            System.out.println(a.getNome() + " says " + a.sound());
                        }
                    }
                    break;

                case 5:

                    System.out.print("Digite o ID: ");
                    long abilityId = s.nextLong();

                    s.nextLine();

                    System.out.print("Digite a habilidade: ");
                    String ability = s.nextLine();

                    for (Animal a : zoo.listAnimals()) {
                        if (a.getId() == abilityId) {
                            System.out.println(a.performAbility(ability));
                        }
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        s.close();
    }
}