
import java.util.Scanner;
class _2D_Array {

		public static void main(String[] args) {

		
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

					
					
				   	System.out.println("Enter the # of rows in the array 2: ");
					int rows2= scan.nextInt();
					System.out.println("Enter the # of columns in the array 2: ");
					int columns2= scan.nextInt();
					int matrix2[][]= new int[rows][columns];
					
					for(int k=0;k<rows2;k++){
						for(int m=0;m<columns2;m++) {
							System.out.print("Value at " + k+ ", "+m+" : ");
							matrix2[k][m]= scan.nextInt();
						}
						System.out.println();
						}
					
					
							
						for(int i=0;i<rows;i++){
							for(int j=0;j<columns;j++) {
									for(int k=0; k<rows2;k++) {
										for(int m=0;m<columns2;m++) {
											if(matrix[i][j] == matrix2[k][m]) {
												System.out.print(matrix[i][j]);
											}
										}
									}
							}
							System.out.println();
							}
}
}