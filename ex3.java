import java.util.Scanner;

class ex3{
	public static void main(String[] args){
		Scanner myNum= new Scanner(System.in);
   		System.out.println("What is your number? I will return 10 x your number...");

   		float inputNum = myNum.nextFloat();
   		System.out.println(10*inputNum);
	}


}