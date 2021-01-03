package com.company;

public class reverse {
    public static void main(String[] args) {
        int x = 123;

        if(x<0){
            Long s = Long.valueOf(new StringBuffer(String.valueOf(x).substring(1)).reverse().toString());
            System.out.println(new Long(s).intValue() == s ? -(new Long(s).intValue()) : 0);
        }else{
            Long s = Long.valueOf(new StringBuffer(String.valueOf(x)).reverse().toString());
            System.out.println(new Long(s).intValue() == s ? (new Long(s).intValue()) : 0);
        }
//        long res = 0;
//        while (x != 0) {
//            res = res * 10 + x % 10;
//            x /= 10;
//        }
//        return (int) res == res ? (int) res : 0;


    }
}
