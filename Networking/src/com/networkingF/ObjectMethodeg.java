package com.networkingF;

import java.net.*;
public class ObjectMethodeg {

	public static void main(String[] args) {
		try{
			InetAddress i = InetAddress.getByName("www.google.com");
			InetAddress i1 = InetAddress.getByName("www.facebook.com");
			InetAddress i3 = InetAddress.getByName("www.google.com");
			String str= i3.toString(); 
			 
			System.out.println("The result of toString() is "+ str);
			System.out.println("The first hashcode is "+i.hashCode()); 
			System.out.println("The second hashcode is "+i1.hashCode());
			 
			byte[] address = i.getAddress();
			if(address.length == 4){
				System.out.println("IPV4");
			}
			else if(address.length == 16){
				System.out.println("IPV6");
			}
			else{
				System.out.println("Invalid");
			}
			 
			
			if(i.equals(i1)){
				System.out.println("Both are same");
			}
			else{
				System.out.println("They are not same");
			}
			
			
		}catch(UnknownHostException e){
			System.out.println("Unknown Host");
		}
	

	}

}
