import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;

class CGUI implements ActionListener
{
	JFrame frame;
	JLabel msgLabel, MLabel;
	JButton send;
	JTextField message;
	Socket sobj;
	PrintStream pobj;
	BufferedReader bobj1;
	BufferedReader bobj2;
	String str1 = null, str2 = null;
	
	public CGUI() throws Exception
	{
		frame = new JFrame("Client");

		MLabel = new JLabel("Message");
		MLabel.setBounds(50,50,100,30);
		frame.add(MLabel);

		message = new JTextField();
		message.setBounds(110, 50, 150, 30);
		frame.add(message);

		send = new JButton("SEND");
		send.setBounds(115, 100, 70, 30);
		frame.add(send);
		send.addActionListener(this);

		msgLabel = new JLabel("");
		msgLabel.setBounds(30, 150, 200, 30);
		frame.add(msgLabel);
		
		frame.setSize(300,300);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		sobj = new Socket("localhost", 2400);

		pobj = new PrintStream(sobj.getOutputStream());
		bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
		//bobj2 = new BufferedReader(new InputStreamReader(System.in));

		while(!((str1) = bobj1.readLine()).equals("bye"))
		{
			msgLabel.setText("Server says " + str1);
		}
	}

	public void actionPerformed(ActionEvent aobj)
	{
		try
		{
			if(aobj.getSource() == send)
			{
				str2 = message.getText();
				pobj.println(str2);

				if(str2.equals("bye"))
				{
					frame.dispose();
					System.exit(0);
				}
			}
		}
		catch(Exception eobj)
		{
			msgLabel.setText("Enter a message to send!");
		}
	}
}

class ChatClientGUI
{
	public static void main(String A[]) throws Exception
	{
		CGUI gobj = new CGUI();
	}
}