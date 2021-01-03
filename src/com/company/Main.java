package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner cin = new Scanner(System.in);
        String inputStr = null;
        while(cin.hasNext()) {
            inputStr = cin.next();
        }
        String[] split = inputStr.split(";");       //1,2,3,4,5;2
        String listNodeStr = split[0];              //1,2,3,4,5
        String[] listNodes = listNodeStr.split(",");//1 2 3 4 5
        ListNode listNode = new ListNode(Integer.parseInt(listNodes[0]));
        ListNode tempNode = listNode;
        for (int i = 1; i < listNodes.length; i++) {
            ListNode currNode = new ListNode(Integer.parseInt(listNodes[i]));
            tempNode.next = currNode;
            tempNode = currNode;
        }
        ListNode res = removeNthFromEnd(listNode, Integer.parseInt(split[1]));
        while (true) {
            System.out.print(res.val);
            if(res.next == null) {
                break;
            }
            System.out.print(",");
            res = res.next;
        }
    }

    static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = head;
        ListNode end = head;
        for (int i=n;i>0;i--){
            start = start.next;
        }
        while (start.next!=null){
            start = start.next;
            end = end.next;
        }
        end.next = end.next.next;
        return head;
    }
}
