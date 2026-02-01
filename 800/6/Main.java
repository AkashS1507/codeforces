//Doremy's paint 3
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while(t-- > 0){
            int n = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

            if(map.size() > 2) System.out.println("No");
            else if(map.size() == 1) System.out.println("Yes");

            else{
                int odd, even;
                if(n % 2 == 0){
                    odd = n / 2;
                    even = n / 2;
                }
                else {
                    odd = (n / 2) + 1;
                    even = n / 2;
                }
                

                boolean flag1 = false;
                boolean flag2 = false;
                for(int count : map.values()){
                    if(count == odd) flag1 = true;
                    if(count == even) flag2 = true;
                }
                System.out.println((flag1 && flag2)? "Yes" : "No");
            }

        }
        sc.close();
    }
}
