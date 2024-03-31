import java.util.Scanner;
public class Ex1{
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please input an value: ");
        int n = input.nextInt();
        input.nextLine();
        if ( n > 10) {
            System.out.println("Este número é maior do que 10");            
        } else if (n == 10){
            System.out.println("Este é o número 10");                
        }
        else {
            System.out.println("Este número é menor do que 10");            
        }
        input.close();
    }
}