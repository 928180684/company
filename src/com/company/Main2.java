package com.company;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
//        int temp;
        int[] array = new int[]{42,20,17,13,28,14,23,15};
        int lenth = array.length;

        for(int i=0;i<lenth-1;i++){

            int minIndex = i;
            for(int j=i+1;j<lenth;j++){
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
