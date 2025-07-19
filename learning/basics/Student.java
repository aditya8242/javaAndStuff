import java.util.*;

class Student{
	int roll_no;
	String name;
	int percentage;
	
	Student()
	{
		roll_no = 0;
		name = "ABS";
		percentage = 0;
	}
	
	public void assign(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your roll number: ");
		this.roll_no = sc.nextInt();
		System.out.println("Enter your percentage: ");
		this.percentage = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your name: ");
		this.name = sc.nextLine();
	}
	
	public void display(){
		System.out.println("Roll number: " + roll_no);
		System.out.println("Name: " + name);
		System.out.println("Percentage: " + percentage);
	}
	
	public static void sortStudent(Student objArr[], int n){
		int i, j;
		
		System.out.println(n);
		for(i = 0; i < n - 1; i++)
		{
			for(j = 0; j < n- 1; j++)
			{
				if(objArr[j].percentage > objArr[j+1].percentage)
				{
					int temp = objArr[j].percentage;
					objArr[j].percentage = objArr[j+1].percentage;
					objArr[j+1].percentage = temp;
				}
			}
		}
		
		System.out.printf("Sorted perctange: "); 
		for(i = 0; i < n; i++)
		{
			System.out.printf("%d ", objArr[i].percentage);
		}
		
		System.out.println();
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many objects do you want to create? ");
		int n = sc.nextInt();
		
		Student objArr[] = new Student[n];
		
		
		for(int i = 0; i < n; i++)
		{
			objArr[i] = new Student();
			objArr[i].assign();
			objArr[i].display();
		}
		
		// calling sortStudent passing n
		Student.sortStudent(objArr, n);
	}
}
