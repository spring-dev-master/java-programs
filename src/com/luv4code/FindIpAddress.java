package com.luv4code;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class FindIpAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("localhost");
        System.out.println(byName);
    }
}
