import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum;
        int a = 0;
        int b = 1;
        for(int i =0; i<=n; i++){
            System.out.println(a);
            sum = a + b;
            a = b;
            b=sum;
        }
    }
}
