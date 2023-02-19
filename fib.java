class Fibonacci{
public static int fib(int n){
if(n==0)
return 0;
return fib(n-1)+fib(n-2);
}

public static void main(String[] args){
for(int i=1;i<=10;i++){
System.out.println(fib(i));
}}}