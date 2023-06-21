import java.util.Scanner;

class SeperationArray{

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
	System.out.println();
	System.out.println("Odd numbers in the Array:");
	for(int values:val)
	{	
		if(values%2==1)
			{
			System.out.println(values + "  ");
			}			
	}


	System.out.println();
	System.out.println("Prime numbers in the Array:");

	for(int values:val)
	{
		int count = 0;
		for(int i = 1;i<=values;i++)
		{
			if (values%i==0)
			{
			count=count+1;
			}
		}
		if(count==2)
		{
		System.out.println(values+ " ");

		}
	}
}
}