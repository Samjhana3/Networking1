package com.networkingF;
import java.net.*;

public class Inetaddress {

	public static void main(String[] args){
		try{
			InetAddress address = InetAddress.getByName("www.instagram.com");
			System.out.println(address);
			System.out.println(address.getHostName());
			System.out.println(address.getAddress());
			System.out.println(address.getCanonicalHostName());
			System.out.println(address.getHostAddress());
			
		}
			catch (UnknownHostException e){
				System.out.println("error");
			
			}
		    		
			
		}

		}
