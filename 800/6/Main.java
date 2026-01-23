import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            boolean flag = true;
            int sum = a[0] + a[1];
            for(int i = 1; i < n; i++){
                if(sum != a[i - 1] + a[i]){
                    flag = false;
                }
            }
            if(flag){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

        }
        sc.close();
    }
}
