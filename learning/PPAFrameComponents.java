import javax.swing.*;

class PPAFrameComponents
{
	public static void main(String A[])
	{
		JFrame fobj = new JFrame("PPA");

		JButton bobj = new JButton("OK");
		
		fobj.add(bobj);
		fobj.setSize(300, 300);
		fobj.setVisible(true);

		fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}