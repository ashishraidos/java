import java.util.*;
class Main{
public static int calcpow(int x, int n){
if(n==0){
return 1;}
if(x==0){
return 0;}
int xpownm1=calcpow(x,n-1);
int xpown=x*xpownm1;;
return xpown;
 }

public static void main(String args[]){
System.out.print("enter the number you want to calculate = ");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
System.out.print("enter the power you want to calculate = ");
int n=sc.nextInt();
System.out.println(calcpow(x,n));
}}