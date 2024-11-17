package LeetCode;

import java.util.*;

public class RemoveDublicateFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int nextIndex = 1;
        int prevIndex = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[prevIndex]){
                prevIndex++;
                nums[prevIndex] = nums[i];
                nextIndex++;
            }
        }
        return nextIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(removeDuplicates(nums));
    }
}
