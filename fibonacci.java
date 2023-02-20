import java.util.*;
class Main{
public static void printfib(int a, int b, int n){
if(n==0){
return ;}
int c=b+a;
System.out.println(c);
printfib(b,c,n-1);
 }

public static void main(String args[]){
System.out.print("enter the number you want to factorial = ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=0;
int b=1;
System.out.println(a);
System.out.println(b);
printfib(a,b,n-2);
}}