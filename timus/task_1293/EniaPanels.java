import java.util.Scanner;

public class EniaPanels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long N = in.nextLong();
        long A = in.nextLong();
        long B = in.nextLong();

        long result = N * 2L * A * B;

        System.out.println(result);

        in.close();
    }
}
