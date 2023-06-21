import java.util.Scanner;
class stringAlphanum{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the alphanumeric string: ");
String myString = scan.nextLine();
int sum=0;

for(int i=0;i<myString.length();i++){
char ch = myString.charAt(i);

if(Character.isDigit(ch)){
sum = sum+ Integer.parseInt(ch+"");
}
else{
sum=sum;
}

}

System.out.println(sum);

}
}