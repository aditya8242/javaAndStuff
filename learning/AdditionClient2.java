import java.util.*;
import java.io.*;
import java.net.*;

class AdditionClient2
{
	public static void main(String A[]) throws Exception
	{
		System.out.println("Client is running...");


		Socket sobj = new Socket("localhost", 2100);
		System.out.println("Server successfully connected");

		DataInputStream diobj = new DataInputStream(sobj.getInputStream());
		DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());
	}
}