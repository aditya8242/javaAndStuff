import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

class Calculator implements ActionListener
{
	// characteristics
	JFrame fobj;
	JButton add, sub, div, mul;
	JTextField num1, num2;
	JLabel Num1Label, Num2Label, Res;

	public Calculator()
	{
		fobj = new JFrame("Basic Calculator");

		// buttons
		add = new JButton("+");
		sub = new JButton("-");
		div = new JButton("/");
		mul = new JButton("*");

		// text fields
		num1 = new JTextField();
		num2 = new JTextField();

		// labels
		Num1Label = new JLabel("Number 1");
		Num2Label = new JLabel("Number 2");
		Res = new JLabel("");

		// setBounds
		Num1Label.setBounds(50, 50, 80, 30);
		Num2Label.setBounds(50, 100, 80, 30);
		num1.setBounds(150, 50, 80, 30);
		num2.setBounds(150, 100, 80, 30);
		add.setBounds(30, 200, 50, 50);
		sub.setBounds(90, 200, 50, 50);
		mul.setBounds(150, 200, 50, 50);
		div.setBounds(210, 200, 50, 50);
		Res.setBounds(30, 280, 250, 40);


		// adding components
		fobj.add(Num1Label);
		fobj.add(Num2Label);
		fobj.add(num1);
		fobj.add(num2);
		fobj.add(add);
		fobj.add(sub);
		fobj.add(mul);
		fobj.add(div);
		fobj.add(Res);

		fobj.getContentPane().setBackground(Color.LIGHT_GRAY); // for bgcolor, have to import awt.Color
		fobj.setLayout(null);
		fobj.setVisible(true);
		fobj.setSize(300, 400);
		fobj.setDefaultCloseOperation(fobj.EXIT_ON_CLOSE);

		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
	}

	public void actionPerformed(ActionEvent aobj)
	{
		try
		{
			int no1 = Integer.parseInt(num1.getText());
			int no2 = Integer.parseInt(num2.getText());
			
			if(aobj.getSource() == add) // can use getActionCommand(), gives text of that button
			{
				Res.setText("Result: " + (no1+no2));
			}
			else if(aobj.getSource() == sub)
			{
				Res.setText("Result: " + (no1-no2));
			}
			else if(aobj.getSource() == mul)
			{
				Res.setText("Result: " + (no1*no2));
			}
			else if(aobj.getSource() == div)
			{
				if(no2 == 0)
				{
					Res.setText("Result: Cannot divide by 0");
				}
				else
				{
					Res.setText("Result: " + ((double)no1/(double)no2));
				}
			}
		}
		catch(Exception eobj)
		{
			Res.setText("Enter valid number...");
		}
	}
}

class BasicCalculatorX
{
	public static void main(String A[])
	{
		Calculator cobj = new Calculator();
	}
}