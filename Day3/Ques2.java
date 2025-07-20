class Student{
String name;
int roll_no;
int phone_number;
String address;
  Student (String name,int roll_no,int phone_number,String address)
{
this.name=name;
this.roll_no=roll_no;
this.phone_number=phone_number;
this.address=address;
}
void display()
{
System.out.println("Name of the student is: "+this.name);
System.out.println("Rollno of the student is: "+this.roll_no);
System.out.println("Phone of the student is: "+this.phone_number);
System.out.println("Address of the student is: "+this.address);
}
}
public class Ques2
{
public static void main(String []args)
{
Student obj=new Student("John",2,1234567,"Anna nagar");
Student obj1=new Student("Sam",3,25678,"T nagar");
obj1.display();
obj.display();
}
}