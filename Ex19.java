import java.util.Scanner;

public class Ex19 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Insira a altura do cilindro: ");
        double h = input.nextDouble();
        System.out.printf("Insira o raio do cilindro: ");
        double r = input.nextDouble();
        input.nextLine();
        double volume = 3.14 * Math.pow(r,2) * h; 
        System.out.printf("O volume do cilindro é o seguinte: %.2f\n", volume);
                  
    }
}
