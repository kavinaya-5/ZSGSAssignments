//3. Create a Java application to manage employees in a company. Define an abstract class Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.
import java.util.Scanner;
abstract class Employee
{
    abstract void calculateSalary();
    abstract void displayDetails();
}
class FullTimeEmployee extends Employee
{
    int months;
    int salaryPerMonth;
    String name;
    String department;
    int totalSalary=0;
    FullTimeEmployee(String name,String department,int months,int salaryPerMonth)
    {
        this.months=months;
        this.salaryPerMonth=salaryPerMonth;
        this.name=name;
        this.department=department;
    }
    @Override
    void calculateSalary()
    {
        totalSalary=months*salaryPerMonth;
    }
    @Override
   public void displayDetails()
    {
        System.out.println("Name of the employee is: "+name);
        System.out.println("Department of the employee is: "+department);
        System.out.println("Total salary of the employee is: "+totalSalary);
    }
}
class PartTimeEmployee extends Employee
{
    double totalSalary;
    String name;
    String department;
    int days;
    int hours;
    double amountPerHour;
    PartTimeEmployee(String name,String department,int days,int hours,double amountPerHour)
    {
        this.name=name;
        this.department=department;
        this.days=days;
        this.hours=hours;
        this.amountPerHour=amountPerHour;
    }
    @Override
    void calculateSalary()
    {
        totalSalary=(days*hours*amountPerHour);
    }
    @Override
   public void displayDetails()
    {
        System.out.println("Name of the employee is: "+name);
        System.out.println("Department of the employee is: "+department);
        System.out.println("Total salary of the employee is: "+totalSalary);
    }
}
public class Ques3
{
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the name,department,months and salary:");
        Employee fulltime=new FullTimeEmployee(in.nextLine(),in.nextLine(),in.nextInt(),in.nextInt());
        in.nextLine();
        fulltime.calculateSalary();
        fulltime.displayDetails();
        System.out.println("enter the name,department,days,hours and salary:");
        Employee partTime =new PartTimeEmployee(in.nextLine(),in.nextLine(),in.nextInt(),in.nextInt(),in.nextDouble());
        in.nextLine();
        partTime.calculateSalary();
        partTime.displayDetails();
    }
}
