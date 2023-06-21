class sc
{
public static void main(String[] args)
{

int x=3000;
int a;
int b;
int count = 0;

for(a=x; a>=1; a--)
{

for(b=a;b>=1;b--){
if(a%b ==0)
{
count = count + 1;
}
}

if(count==2){
System.out.println(a);
}
count = 0;
}

}
}


