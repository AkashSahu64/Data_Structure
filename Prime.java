import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element: ");
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++){
            System.out.println("Enter the Numbers: ");
            int n = sc.nextInt();
            int c = 0;
            for (int d = 2; d*d <=n; d++){
                if(n % d == 0){
                    c++;
                    break;
                }
            }
            if(c == 0){
                System.out.println("Prime");
            }else {
                System.out.println("Not Prime");
            }
        }
    }
}
