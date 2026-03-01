import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input year of birth:");
        int birthYear = in.nextInt();

        System.out.println("Input current year:");
        int currentYear = in.nextInt();

        int age = currentYear - birthYear;

        System.out.println("Your age is " + age);
        in.close();
    }
}
