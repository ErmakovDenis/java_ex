import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input current day of week:");
        String dayOfWeek = in.nextLine();

        System.out.println("Input current month name:");
        String month = in.nextLine();

        System.out.println("Input day of month (number):");
        int day = in.nextInt();

        System.out.println("Today is: " + dayOfWeek + ", " + day + " " + month);
        in.close();
    }
}
