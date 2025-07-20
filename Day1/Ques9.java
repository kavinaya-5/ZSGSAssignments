public class Ques9
{
public static void main(String []args)
{
Employee obj=new Employee(1,"Naga","ECE",20000);
obj.display();
}
}
class Employee{
int empId;
String name;
String department;
double salary;

Employee(int empId,String name,String department,double salary)
{
this.empId=empId;
this.name=name;
this.department=department;
this.salary=salary;
}
void display()
{
System.out.println("The Id Of Employee is:"+this.empId);
System.out.println("The Name Of Employee is:"+this.name);
System.out.println("The Department Of Employee is:"+this.department);
System.out.println("The Salary  Of Employee is:"+this.salary);
}
}

