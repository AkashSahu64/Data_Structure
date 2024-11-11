package Array;

import java.util.*;

public class IndexOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int x  = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++){
            if (x == arr[i]){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
