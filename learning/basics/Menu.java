import java.util.*;

class Menu{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean looping = true;
		while(looping)
		{
			System.out.println("Menu:\n1. Volume of Cylinder\n2. Factorial\n3. Armstrong\n4. Exit");
			int choice = sc.nextInt();
			System.out.println("Choice: " + choice);
			switch(choice)
			{
				case 1:
				System.out.print("Enter radius: ");
				double radius = sc.nextDouble();
				System.out.print("Enter height: ");
				double height = sc.nextDouble();
				double volume = Math.PI * (radius*radius) * height;
				System.out.println("Volume = " + volume);
				break;
				
				case 2:
				int fact = 1, i = 0;
				System.out.print("Enter a number to find its factorial: ");
				int num = sc.nextInt();
				//System.out.println("Num " + num + "i " + i);
				//int a = sc.nextInt();
				//i = num;
				for(i = num; i >= 1; i--)
				{
					//System.out.println("Multiplying with " + i);
					fact = fact * i;
				}
				System.out.println("Factorial of " + num + " is " + fact);
				break;
				
				case 3:
				int n, digit, sum = 0, temp;
					
				System.out.println("Enter a number to check if it is Armstrong or not ");
				n = sc.nextInt();
				
				temp = n;
				
				while(n > 0)
				{
					digit = n % 10;
					sum = sum + (digit*digit*digit);
					n = n / 10;
				}
				
				if(sum == temp)
				{
					System.out.println(temp + " is an armstrong number\n");
				}
				else
				{
					System.out.println(temp + " is not an armstrong number\n");
				}
				break;
				
				case 4:
				System.exit(1);
			}
		}
	}
}
