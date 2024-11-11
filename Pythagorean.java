import java.util.*;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int greater = Math.max(a, Math.max(b, c));

        if (greater == a){
            boolean flag = ((a * a) == (b*b + c*c));
            System.out.println(flag);
        }else if(greater == b) {
            boolean flag = ((b * b) == (a*a + c*c));
            System.out.println(flag);
        }else {
            boolean flag = ((c * c) == (b*b + a*a));
            System.out.println(flag);
        }
    }
}
