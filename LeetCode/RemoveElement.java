package LeetCode;

import java.util.*;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0){
            return 0;
        }
        int k = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        System.out.println(removeElement(nums, val));
    }
}
