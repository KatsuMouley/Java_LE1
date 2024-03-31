import java.util.Scanner;
public class Ex2{
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please input the first value: ");
        int n1 = input.nextInt();
        System.out.printf("Please input the second value: ");
        int n2 = input.nextInt();
        input.nextLine();
        System.out.println("A soma de ambos os valores é: " + (n1 + n2));
        input.close();            
    }
}