import java.util.Scanner;

public class MaquinaDeDoces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo à máquina de Doces e Salgados");
        System.out.println("************************************************");
        System.out.println("1:\t\t Chocolate");
        System.out.println("2:\t\t Bala");
        System.out.println("3:\t\t Refrigerante");
        System.out.println("4:\t\t Água");
        System.out.println("5:\t\t Suco");
        System.out.println("************************************************\n");
        System.out.println("Escolha uma Opção:\n");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu Chocolate.");
                break;
            case 2:
                System.out.println("Você escolheu Bala.");
                break;
            case 3:
                System.out.println("Você escolheu Refrigerante.");
                break;
            case 4:
                System.out.println("Você escolheu Água.");
                break;
            case 5:
                System.out.println("Você escolheu Suco.");
                break;
            default:
            System.out.println("Insira um número válido.");
                break;
        }
        sc.close();
    }
}
