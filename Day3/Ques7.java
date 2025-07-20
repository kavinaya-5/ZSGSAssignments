class Employee 
{
String emp_name;
int year_of_joining;
double salary;
String address;
Employee(String emp_name,int year_of_joining,double salary,String address)
{
this.emp_name=emp_name;
this.year_of_joining=year_of_joining;
this.salary=salary;
this.address=address;
}
void display()
{

        
        String formatted = String.format("%s %d %.2f %s", emp_name, year_of_joining,salary, address);
        System.out.println(formatted);
}
}
public class Ques7
{
public static void main(String []args)
{
Employee obj=new Employee("Robert",1994,2000000,"64C-WallsStreet");
Employee obj1=new Employee("Sam",2000,300000,"68D-WallsStreet");
Employee obj2=new Employee("John",1999,400000,"26B-WallsStreet");
obj.display();
obj1.display();
obj2.display();
}
}

