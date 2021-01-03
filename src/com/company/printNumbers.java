package com.company;

public class printNumbers {
    public static void main(String[] args) {

        int n = 2;
        int end = (int) (Math.pow(10,2));
        int []res = new int[end-1];
        for (int i =1 ;i<end;i++){
            res[i-1]=i;
        }
        System.out.println(res);
    }
}
