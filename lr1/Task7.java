import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your age:");
        int age = in.nextInt();

        System.out.println("Input current year:");
        int currentYear = in.nextInt();

        int birthYear = currentYear - age;

        System.out.println("Your year of birth is " + birthYear);
        in.close();
    }
}
