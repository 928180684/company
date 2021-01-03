package com.company;

public class myPow {
    public static void main(String[] args) {
        double x = 2.000;
        int n = -2;
        if(x == 0) System.out.println(0);
        long b = n;
        double res = 1.0;
        if(b < 0) {
            x = 1 / x;
            b = -b;
        }
        while(b > 0) {
            if((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        System.out.println(res);

    }
}
