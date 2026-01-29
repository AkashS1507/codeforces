import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n - 1];

            int s1 = 0;
            int s2 = 0;
            for(int i = 0; i < n - 1; i++){
                a[i] = sc.nextInt();
                if(a[i] < 0){
                    s1 += a[i];
                }
                else{
                    s2 += a[i];
                }
            }
            System.out.println((s1 + s2) * -1);
        }
        sc.close();
    }
}
