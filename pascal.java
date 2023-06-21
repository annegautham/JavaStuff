
class pascal{

public static void main(String[] args){

for(int r=1;r<=5;r++)
{
for(int c=5; c>1;c++)
{
System.out.print(" ");
}

int num=1;
for(int c1=1;c1<=r;c1++)
{
System.out.print(num+" ");
num=num*(r-c1)/c1;

}

System.out.println();
}
}
}