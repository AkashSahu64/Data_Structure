import java.util.*;

public class AllPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for(int i = low; i<= high; i++){
            int c = 0;
            for (int d = 2; d*d<=i; d++){
                if (i % d == 0){
                    c++;
                    break;
                }

            }
            if (c==0){
                System.out.println(i);
            }
        }
    }
}
