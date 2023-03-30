package com.networkingF;
import java.net.*;

public class GetInetAddress {
	public static void main(String[] args) {
		try {
			InetAddress local= InetAddress.getByName("127.0.0.1");
			NetworkInterface ni = NetworkInterface.getByInetAddress(local);
    if (ni == null)
{
	System.out.println("Not found");
}
    else{
    	System.out.println(" The result is " +ni);
    }	
		}
		catch(SocketException e){
			System.out.println("Socket exception");
			
	}

}
}
