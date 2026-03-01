import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tests = in.nextInt();
        for (int t = 0; t < tests; t++) {
            String pos = in.next();

            int x = pos.charAt(0) - 'a'; 
            int y = pos.charAt(1) - '1'; 

            int[][] moves = {
                    {2, 1}, {1, 2}, {-1, 2}, {-2, 1},
                    {-2, -1}, {-1, -2}, {1, -2}, {2, -1}
            };

            int count = 0;
            for (int[] m : moves) {
                int nx = x + m[0];
                int ny = y + m[1];
                if (nx >= 0 && nx < 8 && ny >= 0 && ny < 8) {
                    count++;
                }
            }

            System.out.println(count);
        }

        in.close();
    }
}
