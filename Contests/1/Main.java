import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int h = sc.nextInt();

            int[] original = new int[n];
            for (int i = 0; i < n; i++) {
                original[i] = sc.nextInt();
            }

            int[] current = original.clone();

            for (int i = 0; i < m; i++) {
                int b = sc.nextInt() - 1;
                int c = sc.nextInt();

                current[b] += c;

                if (current[b] > h) {
                    current = original.clone();
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(current[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
