class armstrong{
public static void main(String[] args){

int x = 153;
int new_x = x;
int original_number = x;
int remainder;
double sum=0;
int count=0;

while(x>0){
x= x/10;
count = count +1;
}
System.out.println(count);

while(new_x>0){
remainder = new_x%10;
sum = Math.pow(remainder,count)+sum;
new_x = (new_x)/10;
}
System.out.println(5^2);
if(sum==original_number){
System.out.println(original_number + " is an armstrong number.");
}
else{
System.out.println(original_number + " is not an armstrong number.");
}
}
}