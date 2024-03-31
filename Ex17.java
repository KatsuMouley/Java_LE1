import java.util.Scanner;

public class Ex17 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please input nota1: ");
        double n1 = input.nextDouble();
        System.out.printf("Please input nota2: ");
        double n2 = input.nextDouble();
        System.out.printf("Please input nota3: ");
        double n3 = input.nextDouble();
        System.out.printf("Please input peso1: ");
        double p1 = input.nextDouble();
        System.out.printf("Please input peso2: ");
        double p2 = input.nextDouble();
        System.out.printf("Please input peso3: ");
        double p3 = input.nextDouble();
        input.nextLine();
        double mediaP = ((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3);
        System.out.printf("A media ponderada do aluno é a seguinte: %.2f\n", mediaP);
        input.close();
                  
    }
}
