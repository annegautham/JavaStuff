class num_pattern{
public static void main(String[] args){
char rows;
int columns;

for(rows = 1; rows<=9;rows++){
for(columns = 1; columns<=9;columns++){
if (rows+columns==6 || Math.abs(rows-columns) ==4 ||rows+columns==14){
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
