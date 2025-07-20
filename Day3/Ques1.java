
class Student{
String name;
int roll_no;
  Student (String name,int roll_no)
{
this.name=name;
this.roll_no=roll_no;
}
void display()
{
System.out.println("Name of the student is: "+this.name);
System.out.println("Rollno of the student is: "+this.roll_no);
}
}
public class Ques1
{
public static void main(String []args)
{
Student obj=new Student("John",2);
obj.display();
}
}