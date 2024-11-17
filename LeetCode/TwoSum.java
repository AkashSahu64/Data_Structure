package LeetCode;

import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i !=j && nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int target = sc.nextInt();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
