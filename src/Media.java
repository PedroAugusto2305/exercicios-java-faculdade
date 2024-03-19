import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe as notas do aluno:\n");
        System.out.println("Nota do 1° Bimestre:");
        double primeiraNota = sc.nextDouble();
        System.out.println("Nota do 2° Bimestre:");
        double segundaNota = sc.nextDouble();
        System.out.println("Nota do 3° Bimestre:");
        double terceiraNota = sc.nextDouble();
        System.out.println("Nota do 4° Bimestre:");
        double quartaNota = sc.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
        System.out.printf("A média do(a) aluno(a) é: %.2f\n", media);

        if(media < 4) {
            System.out.println("Aluno(a) reprovado(a)!!");
        } else if(media < 5) {
            System.out.println("Aluno(a) de recuperação!!");
        } else if(media < 6) {
            System.out.println("Aluno(a) de conselho!!");
        } else if(media <= 10) {
            System.out.println("Aluno(a) aprovado(a)!!");
        } else {
            System.out.println("Média inválida!!");
        }

        sc.close();
    }
}
