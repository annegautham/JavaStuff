import java.util.Scanner;

class StringArray{
public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
   	System.out.println("Enter the size of the array: ");
	int size = scan.nextInt();
	String names[] =new String[size];
   

	for(int i=0;i<size;i++) {
	System.out.println("Value at Index " +i+ " is: ");
	names[i] = scan.nextLine();
	System.out.println();
	}


	for(int j=0;j<names.length;j++){
		
		names[size-1]=names[j];
		size=size-1;
	
	}

	System.out.println("Strings in Array After Reversing: ");
	System.out.print("[");
	int count1 =0;
	for(String m:names)
	{
		count1++;
		System.out.print(m);
		if(count1<names.length) {
			System.out.print(",");
		}
	}
	System.out.print("]");
	System.out.println();
	
	







}
}