import java.util.*;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 1;
        int sp = n/2;
        int val = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            int cval = val;

            for (int k = 1; k <= st; k++){
                System.out.print(cval+"\t");
                if (k <= st /2){
                    cval++;
                }else {
                    cval--;
                }
            }
            if (i <= n/2){
                sp--;
                st += 2;
                val++;
            }else {
                sp++;
                st -= 2;
                val--;
            }
            System.out.println("");
        }
    }
}