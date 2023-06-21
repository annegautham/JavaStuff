
import java.util.Scanner;
class secondEven {
   public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int array[]= new int[10];

		for(int i=0;i<10;i++){

		System.out.print("Value at Index " + i+" : ");
		array[i]= scan.nextInt();
		System.out.println();
		}    
		
		int count=0;

		for(int i =0; i<10;i++){
		
		if(array[i]%2==0){
		count = count+1;
				
		}
		}

		int arrayEven[]= new int[count];

		int ind=0;
		for(int i =0; i<10;i++){
		
		if(array[i]%2==0){
		arrayEven[ind]=array[i];
		if(ind<count){
		ind++;
		}		
		}
		}	

	  int temp;
      for(int i = 0; i<count; i++ ){
         for(int j = i+1; j<count; j++){

            if(arrayEven[i]<arrayEven[j]){
               temp = arrayEven[i];
               arrayEven[i] = arrayEven[j];
               arrayEven[j] = temp;
            }
         }
      }
	for(int a:arrayEven){
	System.out.println(a);
	}
      System.out.println("Second largest even number is: "+arrayEven[1]);

	
}
}