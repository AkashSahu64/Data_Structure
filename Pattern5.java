import java.util.*;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 1;
        int sp = n/2;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= st; k++){
                System.out.print("*\t");
            }
            if (i <= n/2){
                sp--;
                st += 2;
            }else {
                sp++;
                st -= 2;
            }
            System.out.println("");
        }
    }
}