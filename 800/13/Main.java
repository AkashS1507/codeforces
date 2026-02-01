import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int mn = a[0];
            List<Integer> b = new ArrayList<>();
            List<Integer> c = new ArrayList<>();

            // Put all minimum elements in b
            int i = 0;
            while (i < n && a[i] == mn) {
                b.add(a[i]);
                i++;
            }

            // Remaining elements in c
            while (i < n) {
                c.add(a[i]);
                i++;
            }

            // Output
            if (c.isEmpty()) {
                System.out.println(-1);
            } 
            
            else {
                System.out.println(b.size() + " " + c.size());

                for (int x : b) System.out.print(x + " ");
                System.out.println();

                for (int x : c) System.out.print(x + " ");
                System.out.println();
            }
        }
        sc.close();
    }
}
