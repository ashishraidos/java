class Student{
String name;
int age;
public void printinfo(String name){
System.out.println(name);
}
public void printinfo(int age){
System.out.println(age);
}
public void printinfo(String name,int age){
System.out.println(name+" "+age);
}}
class Main{ 
public static void main(String args[]){
Student s1=new Student();
s1.name="Ashish";
s1.age=22;
Student s2=new Student();
s2.name="Alok";
s2.age=23;

s1.printinfo(s1.name);
s2.printinfo(s2.name);
}}