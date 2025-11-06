import javax.swing.*;
import java.awt.event.*;
import java.net.*;

class GUI implements ActionListener
{
	// characteristics
	JFrame clientFrame;
	JLabel IPLabel, PortLabel, connLabel;
	JTextField IPTxt, PortTxt;
	JButton ConnectBtn;

	public GUI()
	{
		clientFrame = new JFrame("Client GUI");

		IPLabel = new JLabel("Enter IP");
		IPLabel.setBounds(30, 50, 100, 30);
		clientFrame.add(IPLabel);

		IPTxt = new JTextField();
		IPTxt.setBounds(100, 50, 100, 30);
		clientFrame.add(IPTxt);

		PortLabel = new JLabel("Enter Port");
		PortLabel.setBounds(30, 100, 100, 30);
		clientFrame.add(PortLabel);

		PortTxt = new JTextField();
		PortTxt.setBounds(100, 100, 100, 30);
		clientFrame.add(PortTxt);

		ConnectBtn = new JButton("Connect");
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
				String ip = IPTxt.getText();
				int port = Integer.parseInt(PortTxt.getText());

				Socket sobj = new Socket(ip, port);
				connLabel.setText("Connection Successful...");

				sobj.close();
			}
		}
		catch(Exception eobj)
		{
			connLabel.setText("Connection unsuccessful...");
		}
	}
}

class ClientGUI
{
	public static void main(String A[]) throws Exception
	{
		GUI gobj = new GUI();
	}
}