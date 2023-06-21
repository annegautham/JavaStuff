import java.sql.Ref;
import java.util.Scanner;

//Remove Duplicates:
class dups{
public static void main(String[] args) {
System.out.println("Please enter the String : ");
Scanner scan = new Scanner(System.in);
String name = "";
name = name.toLowerCase();
String ref_string = "";
String ref_String2 = "";

for (int i = 0; i < name.length(); i++) {
if (ref_string.indexOf(name.charAt(i)) == -1) {
ref_string = ref_string + name.charAt(i);
} else {
ref_String2 = ref_String2 + name.charAt(i);
}

}
System.out.println("After Removing the duplicates from the string : " + ref_string);
System.out.println("Duplicates in the string : " + ref_String2);


for(int i=0;i<ref_string.length();i++) //helo
{
int count=1;
for(int j=0;j<ref_String2.length();j++) //l
{
if(ref_string.charAt(i)==ref_String2.charAt(j))
{
count++;
}
}
System.out.println("Character "+ref_string.charAt(i)+" is repeated "+count+" time(s)");

}
}



}