class Student{
String name;
int age;
public void getInfo(){
System.out.println("the name of this Student is " + this.name);
System.out.println("the age of this Student is " + this.age);
}}
class Main{
public static void main(String args[]){
Student s1=new Student();
s1.name="ashish";
s1.age=22;
s1.getInfo();
Student s2=new Student();
s2.name="alok";
s2.age=22;
s2.getInfo();
}}