package com.networkingF;
import java.net.*;

public class Networkinterface {
	
	public static void main(String[] args)
	{
		try{
			NetworkInterface ni = NetworkInterface.getByName("eth0");
			if (ni== null)
			{
				System.out.println("Not Found");
			}
			else {
				System.out.println("The result is " + ni);
			}
			
		}catch(SocketException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
