import java.util.Scanner;
public class Ex7 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please input a number: ");
        double n = input.nextInt();
        if (n > 100 && n < 200) {
            System.out.printf("The number %.2f is between 100 and 200\n", n);
        } else {
            System.out.printf("The number %.2f is NOT between 100 and 200\n", n);
        }
    }
}
