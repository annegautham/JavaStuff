import java.util.Scanner;

class EvenArray{

public static void main(String[] args)
{
System.out.println("Hey - Please enter the size");
	Scanner scan = new Scanner(System.in);
	int size = scan.nextInt();
	int val[] = new int[size];

	for(int i=0;i<val.length;i++)
	{
		System.out.println("Please Enter the value at index: "+i);
		val[i]=scan.nextInt();
	}
	System.out.println("Even numbers in the Array:");
		
	for(int values:val)
	{
		if(values%2==0)
			{
			System.out.println(values + "  ");
			}

	}
}
}