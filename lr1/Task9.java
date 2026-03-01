import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number:");
        int x = in.nextInt();

        int x1 = x - 1;
        int x2 = x;
        int x3 = x + 1;
        int x4 = (x1 + x2 + x3) * (x1 + x2 + x3); // квадрат суммы первых трёх

        System.out.println("Sequence:");
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);

        in.close();
    }
}
