import java.util.*;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int n = 1;
        for (int i = 1; i<=col; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(" "+n);
                n++;
            }
            System.out.println("");
        }
    }
}
