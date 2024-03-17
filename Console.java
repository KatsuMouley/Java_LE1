import java.util.Scanner;
public class Console{
    public static void main(String[] args) {
            int n = 0;
        do{
            System.out.printf("Escolha uma atividade para executar\n" +
                "1.\n" +
                "2.\n" +
                "3.\n" +
                "4.\n" +
                "5.\n" +
                "6.\n" +
                "7.\n" +
                "8.\n" +
                "9.\n" +
                "10.\n" +
                "12.\n" + 
                "13.\n" + 
                "14.\n" + 
                "15.\n" + 
                "16.\n" + 
                "17.\n" + 
                "18.\n" + 
                "19.\n" + 
                "20.\nInput:");
            int value = UL.lerInteiro();
            switch (value) {
                case 1:
                    Ex1.run();                    
                    break;
                case 2:
                    Ex2.run();
                    break;
                case 3:
                    Ex3.run();
                    break;
                case 4:
                    Ex4.run(); 
                    break;
                case 5:
                    Ex5.run();
                    break;
                case 6:
                    Ex6.run(); 
                    break;
                case 7:
                    Ex7.run();
                    break;
                case 8:
                    Ex8.run(); 
                    break;
                case 9:
                    Ex9.run();
                    break;
                case 10:
                    Ex10.run();
                    break;
                case 11:
                    Ex11.run();
                    break;
                case 12:
                    Ex12.run();
                    break;
                case 13:
                    Ex13.run();
                    break;
                case 14:
                    Ex14.run();
                    break;
                case 15:
                    Ex15.run();
                    break;
                case 16:
                    Ex16.run();
                    break;
                case 17:
                    Ex17.run();
                    break;
                case 18:
                    Ex18.run();    
                    break;
                case 19:
                    Ex19.run();
                    break;
                
                case 20:
                    Ex20.run();                    
                    break;
                    
                default:
                    break;
            }
            
            System.out.printf("Do you want to execute again?: (1)Yes (Anything)No\nInput:");
            Scanner input = new Scanner(System.in);
            n = input.nextInt();
        } while(n == 1);
    }
}