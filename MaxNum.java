import java.util.Scanner;

class MaxNum
{

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
	int max_number=val[0];
	System.out.println("Smallest number in Array:");
		
	for(int values:val)
	{
		if(max_number>values)
			{
			max_number=values;
			}

	}
	System.out.println(max_number);

}
}