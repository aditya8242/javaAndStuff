import javax.swing.*;

class PPAFrameClose
{
	public static void main(String A[])
	{
		JFrame fobj = new JFrame("PPA");

		fobj.setSize(300, 300);
		fobj.setVisible(true);

		fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}