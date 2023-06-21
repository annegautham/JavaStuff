
import java.util.Scanner;

class Circle{

public static void c(){
Scanner scan = new Scanner(System.in);
System.out.println("Circle radius?");
double r = scan.nextDouble();

System.out.println("Area = "+r*r+" pi units squared.");

}

}


class Rectangle{

public static void rect(){
Scanner scan = new Scanner(System.in);
System.out.println("Height of Rectangle?");
double h = scan.nextDouble();
System.out.println("Width of Rectangle?");
double w = scan.nextDouble();

System.out.println("Area = " +h*w+" units squared.");
}

}


class Main{
public static void main(String[] args){
Circle.c();
Rectangle.rect();
}
}
