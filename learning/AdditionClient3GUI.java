import java.util.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;

class GUI implements ActionListener
{
	// characteristics
	JFrame clientFrame;
	JLabel num1Label, num2Label, connLabel;
	JTextField num1txt, num2txt;
	JButton ConnectBtn;

	public GUI()
	{
		clientFrame = new JFrame("Client Addition GUI");

		num1Label = new JLabel("Number1:");
		num1Label.setBounds(30, 50, 100, 30);
		clientFrame.add(num1Label);

		num1txt = new JTextField();
		num1txt.setBounds(100, 50, 100, 30);
		clientFrame.add(num1txt);

		num2Label = new JLabel("Number2:");
		num2Label.setBounds(30, 100, 100, 30);
		clientFrame.add(num2Label);

		num2txt = new JTextField();
		num2txt.setBounds(100, 100, 100, 30);
		clientFrame.add(num2txt);

		ConnectBtn = new JButton("Add");
		ConnectBtn.setBounds(100,150,100,30);
		clientFrame.add(ConnectBtn);
		ConnectBtn.addActionListener(this);

		connLabel = new JLabel("");
		connLabel.setBounds(70,200,200,30);
		clientFrame.add(connLabel);

		clientFrame.setSize(300,300);
		clientFrame.setLayout(null);
		clientFrame.setVisible(true);
		clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent aobj)
	{
		try
		{
			if(aobj.getSource() == ConnectBtn)
			{
				int no1 = Integer.parseInt(num1txt.getText());
				int no2 = Integer.parseInt(num2txt.getText());

				Socket sobj = new Socket("localhost", 2100);

				DataInputStream diobj = new DataInputStream(sobj.getInputStream());
				DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());

				doobj.writeInt(no1);
				doobj.writeInt(no2);



				int sum = diobj.readInt();
				connLabel.setText("Addition is " + sum);
		
				sobj.close();
			}
		}
		catch(Exception eobj)
		{
			connLabel.setText("Enter valid number...");
		}
	}
}

class AdditionClient3GUI
{
	public static void main(String A[]) throws Exception
	{
		GUI gobj = new GUI();
	}
}