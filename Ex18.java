import java.util.Scanner;

public class Ex18 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please input nota1: ");
        double n1 = input.nextDouble();
        System.out.printf("Please input nota2: ");
        double n2 = input.nextDouble();
        System.out.printf("Please input nota3: ");
        double n3 = input.nextDouble();
        input.nextLine();
        double mediaH = 3/(1/n1+1/n2+1/n3);
        System.out.printf("A media harmônica do aluno é a seguinte: %.2f\n", mediaH);
                  
    }
}
