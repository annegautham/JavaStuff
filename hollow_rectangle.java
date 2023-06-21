class hollow_rectangle{

public static void main(String[] args){

int rows, columns; 
int real_rows = 10;
int real_columns = 10;
for (rows = 1; rows <= real_rows; rows++) 
        
{          
for (columns = 1; columns <= real_columns; columns++)            
{               
if (rows == 1 || rows == real_rows ||columns == 1 || columns == real_columns)                                 
System.out.print("*");                             
else                    
System.out.print(" ");             
            
}            
System.out.println();         
} 

}

}