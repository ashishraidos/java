class pen{
String color;
public void printcolor(){
System.out.println("the color  of this pen is " + this.color);
}}
class Main{
public static void main(String args[]){
pen p1=new pen();
p1.color="red";

pen p2=new pen();
p2.color="black";

pen p3=new pen();
p3.color="blue";

pen p4=new pen();
p4.color =" green";

p1.printcolor();
p2.printcolor();
p3.printcolor();
p4.printcolor();
}}