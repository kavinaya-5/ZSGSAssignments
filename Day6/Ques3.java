//3. Design a class `Employee` with private data members: employee ID, name, designation, department, and monthly salary. Use proper getter and setter methods to access and update these fields. Add a method to calculate and return the annual salary of the employee.
class Employee{
    private int employeeId;
    private String name;
    private String designation;
    private String department;
    private double monthlySalary;
    public void setEmployeeId(int employeeId)
    {
        this.employeeId=employeeId;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setDesignation(String designation)
    {
        this.designation=designation;
    }
    public void setDepartment(String department)
    {
        this.department=department;
    }
    public void setMonthlySalary(double monthlySalary)
    {
        this.monthlySalary=monthlySalary;
    }
    public int  getEmployeeId()
    {
        return employeeId;
    }
    public String getName()
    {
        return name;
    }
    public String getDesignation()
    {
        return designation;
    }
    public String getDepartment()
    {
        return department;
    }
    public double getMonthlySalary()
    {
        return monthlySalary;
    }
    public double CalculateAnnualSalary()
    {
        return 12*monthlySalary;
    }
}
public class Ques3
{
    public static void main(String []args)
    {
        Employee employee=new Employee();
        employee.setEmployeeId(3);
        employee.setName("Vivian");
        employee.setDesignation("MTS");
        employee.setDepartment("IIM");
        employee.setMonthlySalary(40000);
        System.out.println("Id of the employee is: "+employee.getEmployeeId());
        System.out.println("Name of the employee is: "+employee.getName());
        System.out.println("Designation of the employee is: "+employee.getDesignation());
        System.out.println("Department of the employee is: "+employee.getDepartment());
        System.out.println("Salary of the employee is: "+employee.getMonthlySalary());
        System.out.printf("Annual salary of the employee is: %.3f ",employee.CalculateAnnualSalary());
    }
}

