package com.company;

public class hammingWeight {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >>> 1;
        }
        System.out.println(count);

    }
}
