import java.util.*;
import java.io.*;
import java.net.*;

class BasicServer
{
	public static void main(String A[]) throws Exception
	{
		System.out.println("Server is running...");
		ServerSocket ssobj = new ServerSocket(2400);
		System.out.println("Server is waiting at port number 2400");
		Socket sobj = ssobj.accept();
		System.out.println("Client request arrived and accepted by the server");
		ssobj.close();
		sobj.close();
	}
}