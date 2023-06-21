class pattern_cross{

public static void main(String[] args){

int rows;

int columns;

int realRows=5;
int realColumns=5;

for (rows=1;rows<=realRows;rows++){

for(columns=1; columns<=realColumns; columns++){
if(rows==columns || rows+columns==realColumns+1){
System.out.print("*");
}
else{
System.out.print(" ");
}

}
System.out.println();

}
}
}