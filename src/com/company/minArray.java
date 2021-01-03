package com.company;

public class minArray {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,2,2,0,1};
        for(int i=numbers.length-1;i>0;i--){
            if(numbers[i]<numbers[i-1]){
                System.out.println("numbers[i] + "+numbers[i]);
            }
        }
        System.out.println("numbers[0] + "+numbers[0]);
    }
}
