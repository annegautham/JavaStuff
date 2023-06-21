
import java.util.Scanner;
class secondArr {
   public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
				System.out.println("Enter the # of rows in the array: ");
		int rows= scan.nextInt();
		System.out.println("Enter the # of columns in the array: ");
		int columns= scan.nextInt();
		int matrix[][]= new int[rows][columns];
		for(int i=0;i<rows;i++){
		for(int j=0;j<columns;j++) {
		System.out.print("Value at " + i+", "+j+" : ");
		matrix[i][j]= scan.nextInt();
				}
			System.out.println();
					}    

  int temp;

      for(int i = 0; i<rows; i++ ){
         for(int j = i+1; j<columns; j++){

            if(matrix[i]<matrix[j]){
               temp = matrix[i];
               matrix[i] = matrix[j];
               matrix[j] = temp;
            }
         }
      }
      System.out.println("Second largest number is: "+matrix[1]);
   }
}