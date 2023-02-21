class pen{
String color;
public void printcolor(){
System.out.println("the color  of this pen is " + this.color);
}
pen(String color){
this.color=color;
}}
class Main{
public static void main(String args[]){
pen p1=new pen("red");

pen p2=new pen("black");

pen p3=new pen("blue");

pen p4=new pen("green");

p1.printcolor();
p2.printcolor();
p3.printcolor();
p4.printcolor();
}}