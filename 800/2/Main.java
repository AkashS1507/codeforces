//Line trip
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            //Input Line 1
            byte n = sc.nextByte();
            byte x = sc.nextByte();

            //Input Line 2
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            //Distance from 0 to first station
            int tank = a[0] - 0;

            //Distances between stations
            for(int i = 1; i < n; i++){
                int current = a[i] - a[i - 1];
                tank = Math.max(current, tank);
            }

            //Last station → x → Last station
            int last = 2 * (x - a[n - 1]);
            tank = Math.max(last, tank);

            System.out.println(tank);
        }
        sc.close();
    }
}
