import java.util.*;
import java.io.*;
import java.net.*;

class AdditionServer3
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

		int no1 = 0, no2 = 0;

		no1 = diobj.readInt();
		no2 = diobj.readInt();

		int sum = no1 + no2;

		doobj.writeInt(sum);


		sobj.close();
		ssobj.close();
		System.out.println("Server application terminated...");
	}
}