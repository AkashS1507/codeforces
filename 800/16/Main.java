//Desorting
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
           int n = sc.nextInt();
           int[] a = new int[n];

           for(int i = 0; i < n; i++){
               a[i] = sc.nextInt();
           }
           
           int min = Integer.MAX_VALUE;
           boolean flag = false;
           for(int i = 0; i < n - 1; i++){
               if(a[i] > a[i + 1]){
                   flag = true;
                   break;
               }

               int current = a[i + 1] - a[i];
               min = Math.min(current, min); 
           }

           if(flag){
               System.out.println(0);
           }

           else {
                int ans = min / 2 + 1;
                System.out.println(ans);
           }

        }
        sc.close();
    }
}
