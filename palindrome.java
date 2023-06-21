class palindrome{
public static void main(String[] args){
int original_number = 3224;
int temp_num = original_number;
int remainder = 0;
int sum = 0;

while(original_number>0)
{
remainder = original_number%10;
sum = (sum*10)+remainder;
original_number = original_number/10;
}

if(temp_num == sum)
{
System.out.print(sum+" is a palindrome.");
}
else
{
System.out.print(sum+" is not a palindrome.");
}


}
}