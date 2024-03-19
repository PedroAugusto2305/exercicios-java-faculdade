import java.util.Scanner;

public class MediaTernario {
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

        System.out.println(media < 4 ? "Aluno(a) reprovado(a)!!"
                : media < 5 ? "Aluno(a) de recuperação!!"
                : media < 6 ? "Aluno(a) de conselho!!"
                : media <= 10 ? "Aluno(a) aprovado(a)!!" 
                : "Média inválida!!");

        sc.close();
    }
}
