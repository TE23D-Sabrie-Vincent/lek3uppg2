import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
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

    }
}
