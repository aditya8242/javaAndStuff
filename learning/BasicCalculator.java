import javax.swing.*;
import java.awt.event.*;

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
		// add
		if(aobj.getSource() == add)
		{
			if(num1.getText().isEmpty() && num2.getText().isEmpty())
			{
				Res.setText("Enter valid input...");
			}
			else
			{
				int no1 = Integer.parseInt(num1.getText());
				int no2 = Integer.parseInt(num2.getText());
				Res.setText("Result: " + (no1+no2));
			}
		}

		// substract
		if(aobj.getSource() == sub)
		{
			if(num1.getText().isEmpty() && num2.getText().isEmpty())
			{
				Res.setText("Enter valid input...");
			}
			else
			{
				int no1 = Integer.parseInt(num1.getText());
				int no2 = Integer.parseInt(num2.getText());
				Res.setText("Result: " + (no1-no2));
			}
		}

		// multiply
		if(aobj.getSource() == mul)
		{
			if(num1.getText().isEmpty() && num2.getText().isEmpty())
			{
				Res.setText("Enter valid input...");
			}
			else
			{
				int no1 = Integer.parseInt(num1.getText());
				int no2 = Integer.parseInt(num2.getText());
				Res.setText("Result: " + (no1*no2));
			}
		}

		// divide
		if(aobj.getSource() == div)
		{
			if(num1.getText().isEmpty() && num2.getText().isEmpty())
			{
				Res.setText("Enter valid input...");
			}
			else if((Integer.parseInt(num1.getText())) > (Integer.parseInt(num2.getText())))
			{
				try
				{
					int no1 = Integer.parseInt(num1.getText());
					int no2 = Integer.parseInt(num2.getText());

					int division = no1/no2;
					Res.setText("Result: " + division);
				}
				catch(Exception eobj)
				{
					Res.setText("Result: " + "Cannot divide by 0");
				}
			}
			else if((Integer.parseInt(num2.getText())) > (Integer.parseInt(num1.getText())))
			{
				Res.setText("Number 1 should be greater");
			}
		}
	}
}

class BasicCalculator
{
	public static void main(String A[])
	{
		Calculator cobj = new Calculator();
	}
}