class Main{
public static void printint(int n){
if(n==6){
return;}
System.out.println(n);
printint(n+1);}
public static void main(String args[]){
int n=1;
printint(n);}}