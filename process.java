import java.util.Scanner;
class process{

public static void main(String[] args){
main();
}


public static void main(){

System.out.println("Overloaded main method");
}

public static void FtoC(int F){

double C =(F-32) * 5/9;
System.out.println(F+" degrees Farenheit = " + C + " degrees Celsius.");
}


public static void FtoC(float F){

double C =(F - 32) * 5/9;
System.out.println(F+" degrees Farenheit = " + C + " degrees Celsius.");
}



public static void FtoC(double F){

double C =(F -32) * 5/9;
System.out.println(F+" degrees Farenheit = " + C + " degrees Celsius.");
}


}