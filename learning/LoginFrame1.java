import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin
{
	public MarvellousLogin()
	{
		JFrame fobj = new JFrame("Login Portal");
		fobj.setSize(400, 300);
		fobj.setVisible(true);
		fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class LoginFrame1
{
	public static void main(String A[])
	{
		MarvellousLogin mobj = new MarvellousLogin();
	}
}