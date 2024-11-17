package LeetCode;

import java.util.*;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        if(nums.length == 0){
            return 0;
        }
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                index = i;
            }else {
                index = i + 1;
            }
        }
        return  index;
    }

    public static void main(String[] args) {

    }
}
