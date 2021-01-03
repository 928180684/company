package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//7,5,6,4
        String str = sc.next();
        String[] arr  = str.split(",");// 7 5 6 4
        int[] b = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            b[i]=Integer.parseInt(arr[i]);
        }
        Solution solution=new Solution();
        System.out.print(solution.reversePairs(b));
    }
    private static class Solution {
        // 请在Solution中完成你的答案
        public long reversePairs(int[] nums) {
            int count = 0;
            int left = nums.length/2;
            int right = nums.length/2+1;
            for(int i=0;i<nums.length;i++){
                while(left>i){
                    if(nums[i]>nums[left]){
                        count++;
                    }
                    left--;
                }
                while (right<nums.length){
                    if (nums[i]>nums[right]){
                        count++;
                    }
                    right++;
                }
            }
            return count;
        }
    }
}
