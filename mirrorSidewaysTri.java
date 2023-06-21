class mirrorSidewaysTri
{
 public static void main(String[] args)
    
{
	
int stars = 0;
int actual_rows=7;
int space = 4;
int mid_point = space;


for(int rows=1; rows<=7;rows++)
{
if(rows<=mid_point)
{
space--;
stars++;
}
else
{
space++;
stars--;
}
for(int columns =1; columns <=space; columns++)
{
System.out.print("");
}

for(int columns =1; columns <=stars; columns++)
{
System.out.print(" * ");
}

System.out.println();
}
}
}

