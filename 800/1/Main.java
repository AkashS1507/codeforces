//Hallouni Boxes
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();

        while(t-- > 0) {
            //Input Line 1
            byte n = sc.nextByte();
            byte k = sc.nextByte();

            //Input Line 2
            int[] nums = new int[n];
            for(byte i = 0; i < n; i++)
            nums[i] = sc.nextInt();

            if(k == 1) 
            {
                boolean flag = true;
                for(int i = 1; i < nums.length; i++){
                    if(nums[i - 1] > nums[i]) {
                        flag = false;
                        System.out.println("No");
                        break;
                    }
                }
                if(flag == true) System.out.println("Yes");
            }

            //k > 1 always works
            else {
                System.out.println("Yes");
            }
        }
        sc.close();
    }
}