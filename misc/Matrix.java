import java.util.*;

public class Matrix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		
		boolean looping = true;
		while(looping)
		{
			System.out.println("Menu:\n1. Addition\n2. Multiplication\n3. Transpose of any matrix\n4. Exit");
			int choice = sc.nextInt();
			System.out.println("Choice: " + choice);
			switch(choice)
			{
				case 1:
				for(int i = 0; i < 3; i++)
				{
					for(int j = 0; j < 3; j++)
					{
						System.out.print(arr1[i][j] + arr2[i][j] + "\t");
					}
					System.out.println();
				}
				break;
				
				case 2:
				System.out.println("Matrix Multiplication:");
				for (int i = 0; i < 3; i++) {
				    for (int j = 0; j < 3; j++) {
				        int temp = 0;
				        for (int k = 0; k < 3; k++) {
				            temp += arr1[i][k] * arr2[k][j];
				        }
				        System.out.print(temp + "\t");
				    }
				    System.out.println();
				}
				break;
				
				case 3:
				for(int i = 0; i < 3; i++)
				{
					for(int j = 0; j < 3; j++)
					{
						System.out.print(arr1[j][i] + "\t");
					}
					System.out.println();
				}
				break;
				
				case 4:
				System.exit(1);
			}
		}
	}
}
