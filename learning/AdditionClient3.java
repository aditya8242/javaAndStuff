import java.util.*;
import java.io.*;
import java.net.*;

class AdditionClient3
{
	public static void main(String A[]) throws Exception
	{
		System.out.println("Client is running...");


		Socket sobj = new Socket("localhost", 2100);
		System.out.println("Server successfully connected");

		DataInputStream diobj = new DataInputStream(sobj.getInputStream());
		DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());

		int no1 = 11, no2 = 10;

		doobj.writeInt(no1);
		doobj.writeInt(no2);



		int sum = diobj.readInt();
		System.out.println("Addition is " + sum);
		
		sobj.close();

		System.out.println("Client application terminated...");
	}
}