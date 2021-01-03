package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findRepeatNumber {
    public static void main(String[] args) {
        /*

                数组中重复的数字
         */
        int []nums = new int[]{1,2,3,2,3,4};
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        System.out.println(repeat);
    }
}
