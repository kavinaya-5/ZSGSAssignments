//3. Create a Java application to manage employees in a company. Define a base class Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type.
abstract class Employee
{
    abstract double calculateSalary();
}
class FullTimeEmployee extends Employee{
    double amount;
    int months;
    FullTimeEmployee(int months,double amount)
    {
        this.months=months;
        this.amount=amount;
    }
    @Override
    public double calculateSalary()
    {
        return months*amount;
    }
}
class PartTimeEmployee extends Employee
{
    int hoursPerDay;
    int days;
    double amountPerHour;
    PartTimeEmployee(int hours,int days,double amountPerHour)
    {
        this.hoursPerDay=hours;
        this.amountPerHour=amountPerHour;
        this.days=days;
    }
    @Override
    public double calculateSalary()
    {
        return hoursPerDay*amountPerHour*days;
    }
}
public class Ques3
{
    public static void main(String []args)
    {
        FullTimeEmployee fulltimeEmployee=new FullTimeEmployee(8,30000);
        System.out.println(" The salary of the fulltime employee is :"+fulltimeEmployee.calculateSalary());
        PartTimeEmployee parttimeEmployee=new PartTimeEmployee(5,15,300);
        System.out.println(" The salary of the Parttime  employee is :"+parttimeEmployee.calculateSalary());
    }
}


