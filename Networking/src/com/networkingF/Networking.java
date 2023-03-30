package com.networkingF;

import java.net.*;
public class Networking {
public static void main(String[] args){
	try{
	InetAddress address = InetAddress.getByName("www.facebook.com");
	System.out.println(address);
	
	catch (UnknownHostException e){
		System.out.println("error");
	
	}
    		
	
}

}
