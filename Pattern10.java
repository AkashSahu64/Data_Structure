import java.util.*;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int outSpace = n/2;
        int inSpace = -1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= outSpace; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j = 1; j <= inSpace; j++) {
                System.out.print("\t");
            }
            if (i > 1 && i < n){
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                outSpace--;
                inSpace += 2;
            } else {
                outSpace++;
                inSpace -= 2;
            }
            System.out.println("");
        }
    }
}
