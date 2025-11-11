import java.io.*;
import java.net.*;

class ChatServer
{
	public static void main(String A[]) throws Exception
	{
		ServerSocket ssobj = new ServerSocket(5100);
		System.out.println("Server is waiting at port 5100");

		Socket sobj = ssobj.accept();
		System.out.println("Client request gets accepted successfully");

		PrintStream pobj = new PrintStream(sobj.getOutputStream());
		BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
		BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));






		String str = bobj1.readLine();
		System.out.println("Client says " + str);
		System.out.println("Enter message for client:");
		str = bobj2.readLine();
		pobj.println(str);
		
	}
}