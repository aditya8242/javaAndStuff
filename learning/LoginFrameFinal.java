import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin implements ActionListener
{
	// Characteristics
	JFrame fobj;
	JButton bobj;
	JTextField tobj;
	JPasswordField pobj;
	JLabel UserLabel, PassLabel, ResultLabel;

	public MarvellousLogin(String title, int width, int height)
	{
		fobj = new JFrame(title);

		UserLabel = new JLabel("Username");
		UserLabel.setBounds(50, 50, 100, 30);

		tobj = new JTextField();
		tobj.setBounds(150, 50, 150, 30);

		PassLabel = new JLabel("Password");
		PassLabel.setBounds(50, 100, 100, 30);

		pobj = new JPasswordField();
		pobj.setBounds(150, 100, 150, 30);

		bobj = new JButton("Submit");
		bobj.setBounds(150,150,100,30);

		ResultLabel = new JLabel("");
		ResultLabel.setBounds(150, 200, 250, 30);

		fobj.setLayout(null);
		fobj.setSize(width, height);

		fobj.setVisible(true);
		fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		fobj.add(bobj);
		fobj.add(tobj);
		fobj.add(pobj);
		fobj.add(UserLabel);
		fobj.add(PassLabel);
		fobj.add(ResultLabel);

		bobj.addActionListener(this);

	}

	// username: Marvellous
	// password: Marvellous@123
	public void actionPerformed(ActionEvent aobj)
	{
		String uname = tobj.getText();
		String pass = pobj.getText();

		if((uname.equals("Marvellous")) && (pass.equals("Marvellous@123")))
		{
			ResultLabel.setText("Login successful...");
		}
		else
		{
			ResultLabel.setText("Login failed...");
		}
	}
}

class LoginFrameFinal
{
	public static void main(String A[])
	{
		MarvellousLogin mobj = new MarvellousLogin("Login", 400, 300);
	}
}