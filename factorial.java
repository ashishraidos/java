import java.util.*;
class Main{
public static int calcfact(int n){
if(n==1||n==0){
return 1;}
int factnm1=calcfact(n-1);
int factn=n*factnm1;
 
return factn;}

public static void main(String args[]){
System.out.print("enter the number you want to factorial = ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(calcfact(n));
}}