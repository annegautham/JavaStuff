class diamondAlph {
 
    public static void main(String[] args) {
char st_char='A';
char lt_char='I';

for(int r=1;r<=9;r++)
{

	for (int c=1;c<=9;c++)
	{
		if(r+c==6||r+c==14||r-c==4||c-r==4)
			{
				if(r>=6)
					{
					System.out.print(lt_char);
					}
				else{
					System.out.print(st_char);
					}
			}
			else{
				System.out.print(" ");
			}
	}
lt_char--;
st_char++;
System.out.println();
}

}
 
}



