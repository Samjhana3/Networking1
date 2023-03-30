package com.networkingF;
import java.net.*;
import java.util.*;

public class GetNetworkInterface {
	public static void main (String []args) throws SocketException{
		
		//TODO auto-generated method stub
		Enumeration<NetworkInterface> en= NetworkInterface.getNetworkInterfaces();
		while(en.hasMoreElements()){
			NetworkInterface ni = en.nextElement();
		System.out.println(ni);
		}
	}

}
