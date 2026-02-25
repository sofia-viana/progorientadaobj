import java.util.Scanner;

public class MainContaB {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ContaBancaria conta = null;
        int opcao;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Exibir saldo");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite seu Nome: ");
                    String nome = input.nextLine();
                    input.nextLine();
                    System.out.print("Digite o número da conta: ");
                    int numero = input.nextInt();

                    System.out.print("Qual será o saldo inicial? ");
                    double saldo = input.nextDouble();

                    conta = new ContaBancaria(nome, numero, saldo);
                    System.out.println("Conta criada!");
                    break;

                case 2:
                    System.out.print("Valor para depositar: ");
                    double valor = input.nextDouble();
                    conta.depositar(valor);
                    break;

                case 3:
                    System.out.print("Valor para sacar: ");
                    double saque = input.nextDouble();
                    conta.sacar(saque);
                    break;

                case 4:
                    conta.exibirSaldo();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        input.close();
    }
}