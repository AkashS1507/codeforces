//How much does daytona cost?
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                list.add(sc.nextInt());
            }
            if(list.contains(k)){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}