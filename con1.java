class con1{
public static void main(String[] args)
{
int age = 18;
String gender = "female";
if(age>=18 && gender == "male")
{
System.out.println("You can vote!");
}
else if(age>=21 && gender == "female")
{
System.out.println("You can vote!");

}
else
{
System.out.println("Sorry, you can't vote.");
}
}
}