//4. Create a Java application to manage employees in a company. Define an Interface Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.
interface Employee1
{
    abstract void calculateSalary();
    abstract void displayDetails();
}
class FullTimeEmployee1 implements Employee1
{
    int months;
    int salaryPerMonth;
    String name;
    String department;
    int totalSalary=0;
    FullTimeEmployee1(String name,String department,int months,int salaryPerMonth)
    {
        this.months=months;
        this.salaryPerMonth=salaryPerMonth;
        this.name=name;
        this.department=department;
    }
    @Override
   public void calculateSalary()
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
class PartTimeEmployee1 implements Employee1
{
    double totalSalary;
    String name;
    String department;
    int days;
    int hours;
    double amountPerHour;
    PartTimeEmployee1(String name,String department,int days,int hours,double amountPerHour)
    {
        this.name=name;
        this.department=department;
        this.days=days;
        this.hours=hours;
        this.amountPerHour=amountPerHour;
    }
    @Override
     public  void calculateSalary()
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
public class Ques4
{
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the name,department,months and salary:");
        Employee1 fulltime=new FullTimeEmployee1(in.nextLine(),in.nextLine(),in.nextInt(),in.nextInt());
        in.nextLine();
        fulltime.calculateSalary();
        fulltime.displayDetails();
        System.out.println("enter the name,department,days,hours and salary:");
        Employee1 partTime =new PartTimeEmployee1(in.nextLine(),in.nextLine(),in.nextInt(),in.nextInt(),in.nextDouble());
        in.nextLine();
        partTime.calculateSalary();
        partTime.displayDetails();
    }
}

