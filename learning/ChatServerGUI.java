import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;

class SGUI implements ActionListener
{
	JFrame frame;
	JLabel msgLabel, MLabel;
	JButton send;
	JTextField message;
	ServerSocket ssobj;
	Socket sobj;
	PrintStream pobj;
	BufferedReader bobj1;
	BufferedReader bobj2;
	String str1 = null, str2 = null;
	
	public SGUI() throws Exception
	{
		frame = new JFrame("Server");

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

		ssobj = new ServerSocket(2400);
		sobj = ssobj.accept();
		System.out.println("Client connection successful");
		
		pobj = new PrintStream(sobj.getOutputStream());
		bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
		//bobj2 = new BufferedReader(new InputStreamReader(System.in));

		while((str1 = bobj1.readLine()) != null)
		{
			msgLabel.setText("Client says " + str1);
		}
	}

	public void actionPerformed(ActionEvent aobj)
	{
		try
		{
			if(aobj.getSource() == send)
			{
				str1 = message.getText();
				pobj.println(str1);

				if(str1.equals("bye"))
				{
					msgLabel.setText("Client says bye");
					frame.dispose();
					System.exit(0);
				}

				if(str1.equals("OK"))
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

class ChatServerGUI
{
	public static void main(String A[]) throws Exception
	{
		SGUI gobj = new SGUI();
	}
}