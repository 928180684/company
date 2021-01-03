package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class reversePrint {
    ArrayList<Integer> tmp = new ArrayList<Integer>();
    public static void main(String[] args) {
//        recur(head);
//        int[] res = new int[tmp.size()];
//        for(int i = 0; i < res.length; i++)
//            res[i] = tmp.get(i);
//        return res;
    }
    void recur(ListNode head) {
        if(head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }

}
