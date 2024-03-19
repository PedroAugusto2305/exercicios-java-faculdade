import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um item do Cardápio abaixo:");
        System.out.println("Código\t\t Cardápio\t\t Preço");
        System.out.println("************************************************");
        System.out.println("1:\t\t Cachorro Quente\t R$ 8,00");
        System.out.println("2:\t\t X-Salada\t\t R$ 18,00");
        System.out.println("3:\t\t X-Bacon\t\t R$ 16,00");
        System.out.println("4:\t\t Torrada Simples\t R$ 4,00");
        System.out.println("5:\t\t Refrigerante\t\t R$ 5,00");
        System.out.println("************************************************\n");

        System.out.println("Informe o código e a quantidade\n");
        System.out.println("Código do produto desejado: ");
        int code = sc.nextInt();
        System.out.println("Quantidade desejada: ");
        int quantity = sc.nextInt();

        if (code == 1) {
            System.out.printf("Você Escolheu %d Cachorro Quente(s)\n", quantity);
            double result = quantity * 8;
            System.out.printf("O valor da sua conta será de: R$ %.2f reais", result);
        } else if (code == 2) {
            System.out.printf("Você Escolheu %d X-salada(s)\n", quantity);
            double result = quantity * 18;
            System.out.printf("O valor da sua conta será de: R$ %.2f reais", result);
        } else if (code == 3) {
            System.out.printf("Você Escolheu %d X-Bacon(s)\n", quantity);
            double result = quantity * 16;
            System.out.printf("O valor da sua conta será de: R$ %.2f reais", result);
        } else if (code == 4) {
            System.out.printf("Você Escolheu %d Torrada(s) Simples\n", quantity);
            double result = quantity * 4;
            System.out.printf("O valor da sua conta será de: R$ %.2f reais", result);
        } else if (code == 5) {
            System.out.printf("Você Escolheu %d Refrigerante(s)\n", quantity);
            double result = quantity * 5;
            System.out.printf("O valor da sua conta será de: R$ %.2f reais", result);
        }

        sc.close();
    }
}
