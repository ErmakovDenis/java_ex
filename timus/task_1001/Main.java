import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(System.in);
        StringBuilder sb = new StringBuilder();
        int c;

        while ((c = bis.read()) != -1) {
            sb.append((char) c);
        }

        String[] parts = sb.toString().trim().split("\\s+");
        List<Double> vals = new ArrayList<>();

        for (String p : parts) {
            if (!p.isEmpty()) {
                long x = Long.parseLong(p);
                vals.add(Math.sqrt((double) x));
            }
        }

        StringBuilder out = new StringBuilder();
        for (int i = vals.size() - 1; i >= 0; i--) {
            out.append(String.format(java.util.Locale.US, "%.4f", vals.get(i)))
               .append('\n');
        }

        System.out.print(out.toString());
    }
}
