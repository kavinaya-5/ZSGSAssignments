class Employee{
String employee_name;
int emp_id;
String designation;
double salary;
 
Employee ()
{
System.out.println("Object has been created!");
employee_name=null;
emp_id=0;
designation=null;
salary=0.0;
}
Employee(String employee_name,int emp_id,String designation,double salary)
{
this.employee_name=employee_name;
this.emp_id=emp_id;
this.designation=designation;
this.salary=salary;
}
Employee(Employee s)
{
this.employee_name=s.employee_name;
this.emp_id=s.emp_id;
this.designation=s.designation;
this.salary=s.salary;
}

void display()
{
System.out.println(" name of the employee is:" +this.employee_name);
System.out.println(" id of the employee is:" +this.emp_id);
System.out.println(" designation of the employee is:" +this.designation);
System.out.println(" salary of the employee is:" +this.salary);
}
}
public class Ques3
{
public static void main(String []args)
{
Employee obj1=new Employee();
Employee obj2=new Employee("John",3,"Developer",900000);
Employee obj3=new Employee(obj2);
System.out.println("\n---- default----\n");
obj1.display();
System.out.println("\n---- parameterized----\n");
obj2.display();
System.out.println("\n---- copy cons----\n");
obj3.display();
}
}