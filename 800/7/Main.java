import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            String x = sc.next();
            String s = sc.next();
            
            int count = 0;
            boolean found = false;

            for(int i = 0; i <= 6; i++) {
                if(x.contains(s)){
                    System.out.println(count);
                    found = true;
                    break;
                }
                x += x;
                count++;
            }

            if(!found){
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
