
// import java.util.InputMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static double plus(int tal1, int tal2) {

        return (double) tal1 + tal2;
    }

    public static double minus(int a, int b) {
        return (double) a - b;
    }

    public static double multiply(int a, int b) {
        return (double) a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division med noll är inte tillåten!");
        }
        return (double) a / (double) b;
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        boolean running;
        running = true;

        while (running) {
            System.out.println("Meny");
            System.out.println("1.Addition");
            System.out.println("2.Subtraktion");
            System.out.println("3.Multiplikation");
            System.out.println("4.division");
            System.out.println("5.Avsluta");
            System.out.println("Välj 1-5: ");

            int val = 0;

            try {
                val = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Fel: skriv endast nummer 1-5!");
                scanner.next(); // rensar felaktig inmatning
                continue;
            }

            if (val == 5) {
                System.out.println("Stänger av programmet.");
                running = false;
            }

            else if (val >= 1 && val <= 4) {
                try{
               System.out.println("Skriv tal 1");
                    int tal1 = scanner.nextInt();

                    System.out.println("Ange tal 2: ");
                    int tal2 = scanner.nextInt();

                    double result = 0;
                    
                    switch (val) {
                        case 1: result = plus(tal1, tal2); break;
                        case 2: result = minus(tal1, tal2); break;
                        case 3: result = multiply(tal1, tal2); break;
                        case 4: result = divide(tal1, tal2); break;
                    }
                    System.out.println("Resultat: " + result);
                }
                catch (InputMismatchException e) {
                    System.out.println("Fel: du måste skriva in heltal!");
                    scanner.next();
                }
                catch (ArithmeticException e){
                    System.out.println("Fel: " + e.getMessage());

                }
            }
            else{
                System.out.println("Ogiltigt val, välj 1-5!");
                }
                System.out.println();
        }
        scanner.close();
    }
}
