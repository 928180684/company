package com.company;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class FileRecipient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds=new DatagramSocket(6000, InetAddress.getByName("10.160.106.119"));
        byte[] length=new byte[81920];
        DatagramPacket dp=new DatagramPacket(length,0,length.length);
        ds.receive(dp);
        String trim = new String(length).trim();
        Integer integer =trim.length();
        System.out.println(integer);
        byte[] data=new byte[73];

        File file=new File("C:\\Users\\123.jpg");
        if (file.exists()){
            file.createNewFile();
        }
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(file));

        bos.write(dp.getData(),0,dp.getLength());
        bos.flush();
        file=new File("C:\\Users\\123.jpg");
        System.out.println(file.length());
        ds.close();
    }
}
