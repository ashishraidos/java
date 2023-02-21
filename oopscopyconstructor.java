class pen{
String color;
public void printcolor(){
System.out.println("the color  of this pen is " + this.color);
}
pen(pen p2){
this.color=p2.color;
}
pen(){
}}
class Main{ 
public static void main(String args[]){
pen p1=new pen();
p1.color="red";

pen p2=new pen(p1);


p1.printcolor();
p2.printcolor();
}}