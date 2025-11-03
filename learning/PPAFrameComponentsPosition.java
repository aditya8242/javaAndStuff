import javax.swing.*;

class PPAFrameComponentsPosition
{
	public static void main(String A[])
	{
		JFrame fobj = new JFrame("PPA");
		JButton bobj = new JButton("OK");
		
		bobj.setBounds(100,100,150,50); // x, y, width, height // frame excluding system tray
		fobj.add(bobj);
		fobj.setSize(400, 300); // width, height

		fobj.setLayout(null);
		fobj.setVisible(true);

		fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}