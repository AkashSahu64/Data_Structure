import java.util.*;

public class InverseOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inverse = 0;
        int orignalPlace = 1;
        while (n != 0){
            int r = n % 10;
            int invertedDigit = orignalPlace;
            inverse = inverse + invertedDigit * (int)Math.pow(10, r - 1);
            n = n / 10;
            orignalPlace++;
        }
        System.out.println(inverse);
    }
}
