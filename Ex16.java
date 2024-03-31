import java.util.Scanner;

public class Ex16 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please input n1(Nota 1 do aluno): ");
        double n1 = input.nextDouble();
        System.out.printf("Please input n2(Nota 2 do aluno): ");
        double n2 = input.nextDouble();
        System.out.printf("Please input n3(Nota 3 do aluno): ");
        double n3 = input.nextDouble();
        input.nextLine();
        double media = (n1 + n2 + n3) / 3;
        System.out.printf("A média do alubo é de %.2f\n", media);
        input.close();
                  
    }
}
