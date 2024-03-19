import java.util.Scanner;

public class BancaDeJornal {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo à Banca de Jornal");
        System.out.println("************************************************");
        System.out.println("A:\t\t Jornal");
        System.out.println("B:\t\t Revista");
        System.out.println("C:\t\t Mangá");
        System.out.println("D:\t\t Revista de Moda");
        System.out.println("E:\t\t Revista de Negócios");
        System.out.println("************************************************\n");
        System.out.println("Escolha uma Opção:\n");
        String opcao = sc.nextLine().toLowerCase();

        switch (opcao) {
            case "a":
                System.out.println("Você escolheu Jornal.");
                break;
            case "b":
                System.out.println("Você escolheu Revista.");
                break;
            case "c":
                System.out.println("Você escolheu Mangá.");
                break;
            case "d":
                System.out.println("Você escolheu Revista de Moda.");
                break;
            case "e":
                System.out.println("Você escolheu Revista de Negócios.");
                break;
            default:
            System.out.println("Escolha uma opção válida!");
                break;
        }
        sc.close();
    }
}
