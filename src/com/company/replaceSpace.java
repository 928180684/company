package com.company;

public class replaceSpace {
    public static void main(String[] args) {
       String s = "We are happy.";
       StringBuffer stringBuffer = new StringBuffer();

        for (Character c : s.toCharArray()) {
            if(c == ' '){
                stringBuffer.append("%20");
            }else{
                stringBuffer.append(c);
            }
        }
        System.out.println(stringBuffer);

    }
}
