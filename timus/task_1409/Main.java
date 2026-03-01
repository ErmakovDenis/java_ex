import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(); // Гарри
        int b = in.nextInt(); // Ларри
        System.out.println((b - 1) + " " + (a - 1));
        in.close();
    }
}
