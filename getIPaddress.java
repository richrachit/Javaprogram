package java2;

import java.net.InetAddress;

class getIPaddress
{

	public static void main(String[] args) throws Exception
	{
	 InetAddress myIP=InetAddress.getLocalHost();
	 
	 System.out.println("My IP Address is:");
	 System.out.println(myIP.getHostAddress());

	}

}
