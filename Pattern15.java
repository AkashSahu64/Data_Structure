import java.util.*;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1;
        int sp = (2*n-3);
        for (int i = 1; i <= n; i++){
            int num = 1;
            for (int j = 1; j <= val; j++){
                System.out.print(num+"\t");
                num++;
            }
            for (int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            if (i == n) {
                val--;
                num--;
            }
            for (int j = 1; j <= val; j++){
                num--;
                System.out.print(num+"\t");
            }
            val++;
            sp -= 2;

            System.out.println("");
        }
    }
}
