import java.util.Scanner;

public class Ex20 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Insira o tempo que a viagem durou: ");
        double t = input.nextDouble();
        System.out.printf("Insira a distância viajada: ");
        double v = input.nextDouble();
        double l = (t * v) / 12;
        System.out.println("Você gastou "+l+" litros nesta viagem");
                  
    }
}
