import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static double plus(int tal1, int tal2) {

        return (double) tal1 + tal2;
    }

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        val = scanner.nextInt();
        boolean bool;
        bool = true;

        while (bool) {
            System.out.println("Meny");
            System.out.println("1.Addition");
            System.out.println("2.Subtraktion");
            System.out.println("3.Multiplikation");
            System.out.println("4.division");
            System.out.println("5.Avsluta");
            System.out.println("Välj 1-5: ");


        }

        if (val == 5){
            System.out.println("Stänger av programmet.");
            bool = false;
        }

        // else if (val  == 1){
        // System.out.println("Ange tal 1");
        // double num1 = scanner.nextDouble();

        // System.out.println("Ange tal 2");
        // double num2 = scanner.nextDouble();

        // double result = 0;
        // }
        scanner.close();
    }
}
