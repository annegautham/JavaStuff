class sidewaysTri
{
 public static void main(String[] args)
    
{
	
int rows = 6;       
for (int i= 0; i<= rows-1 ; i++)       
{
            
for (int k=0; k<=i; k++) 
            
{ 
            
System.out.print(" * "); 
            
} 
            
System.out.println(); 
            }
for (int i=rows-1; i>=0; i--)
{
for(int k=0; k <= i-1;k++)
{
  System.out.print("* ");
 }
 System.out.println();
   }
 }
}