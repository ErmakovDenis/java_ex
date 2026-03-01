import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name:");
        String name = in.nextLine();

        System.out.println("Input year of birth:");
        int birthYear = in.nextInt();

        System.out.println("Input current year:");
        int currentYear = in.nextInt();

        int age = currentYear - birthYear;

        System.out.println("Name: " + name + ", Age: " + age);
        in.close();
    }
}
