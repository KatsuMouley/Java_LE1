import java.util.Scanner;

public class Ex5 {
    public static void run(){
        double n = 0;
        Scanner input = new Scanner(System.in);
        System.out.printf("Please input the A value: ");
        double B = input.nextInt();
        System.out.printf("Please input the B value: ");
        double A = input.nextInt();
        System.out.printf("-------------------------------------\n");
        System.out.printf("Antes da troca\n");
        System.out.printf("Variavel B = %.2f\nVariavel A = %.2f\n", B, A);
        n = B;
        B = A;
        A = n;
        System.out.printf("Depois da troca\n");
        System.out.printf("Variavel B = %.2f\nVariavel A = %.2f\n", B, A);
        System.out.printf("-------------------------------------\n");
    }
}
