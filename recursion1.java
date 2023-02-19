class Main{
public static void printint(int i, int n, int sum){
if(i==n){
sum +=i ;
System.out.println(sum);
return;}
sum+=i;
printint(i+1,n,sum);}
public static void main(String args[]){
int i=1;
int sum=0;
printint(i,5,sum);
}}