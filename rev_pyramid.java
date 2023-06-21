class rev_pyramid
{
public static void main(String[] args)
{

int spaces=0;
int rows;
int realRows=10;
int stars=realRows*2 - 1;
int columns;


for(rows=1;rows<=realRows;rows++){
	for(columns=1; columns<=spaces;columns++)
	{
	System.out.print(" ");
	}
	for(columns=1; columns<=stars;columns++)
	{
	System.out.print("*");
	}
System.out.println();
stars-=2;
spaces++;
}

}
}