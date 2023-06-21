
import java.util.Scanner;
class replaceString{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter your String: ");
String myString = scan.nextLine();
String newString="";

for(int i =0; i<myString.length();i++){

char ch = myString.charAt(i);

for(int j=i+1;j<myString.length();j++) {
char ch1 = myString.charAt(j);
if(ch==ch1)
{
myString.replace(ch1,' ');
}
}


}

System.out.println(myString);

}
}