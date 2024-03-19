import java.util.Scanner;

public class BancoShabarai {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Forneça seu nome:");
        String name = scan.nextLine();
        System.out.println("Qual tipo de conta?");
        String account = scan.nextLine();
        double balance = 0;

        while (true) {
            clearConsole();
            System.out.println("***********************");
            System.out.println("Nome: " + name);
            System.out.println("Tipo de conta: " + account);
            System.out.println("Saldo: R$ " + balance);
            System.out.println("***********************");

            System.out.println("""
                    Operações
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair

                    Digite a opção desejada:
                        """);

            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O Saldo atual é de: " + balance);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja depositar: ");
                    double value = scan.nextDouble();
                    balance += value;
                    System.out.println(balance);
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja transferir: ");
                    double transferValue = scan.nextDouble();
                    if (balance < transferValue) {
                        System.out.println("Você não tem saldo disponível.");
                    } else {
                        balance = balance - transferValue;
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scan.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println("Pressione Enter para continuar...");
            scan.nextLine();
        }
    }

    private static void clearConsole() {
        for (int i = 0; i < 5; i++) {
            System.out.println();
        }
    }
}
