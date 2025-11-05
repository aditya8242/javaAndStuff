import java.util.*;
import java.io.*;
import java.net.*;

class AdditionServer2
{
	public static void main(String A[]) throws Exception
	{
		System.out.println("Server is running...");
		ServerSocket ssobj = new ServerSocket(2100);
		System.out.println("Server is waiting at port number 2100");
		Socket sobj = ssobj.accept();
		System.out.println("Client request arrived and accepted by the server");

		DataInputStream diobj = new DataInputStream(sobj.getInputStream());
		DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());
	}
}