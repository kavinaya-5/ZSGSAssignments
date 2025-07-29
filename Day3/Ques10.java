class BasicCalculator{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int subtract(int a,int b)
    {
        return a-b;
    }
    public int multiply(int a,int b)
    {
        return a*b;
    }
    public int divide(int a,int b)
    {
        return a/b;
    }
}
 class AdvancedCalculator extends BasicCalculator{
public int power(int base,int exponent)
{
    int ans=1;
    for(int i=0;i<exponent;i++)
    {
        ans=ans*base;
    }
    return ans;
}
public int modulus(int a,int b)
{
    return a%b;
}
public double squareRoot(int number)
{
    return Math.sqrt(number);
}
}
class ScientificCalculator extends AdvancedCalculator{
public double sin(double num)
{
    return Math.sin(num);
}
public double cos(double num)
{
    return Math.cos(num);
}
public double log(double num)
{
    return Math.log(num);
}
public double exponent(double num)
{
    return Math.exp(num);
}
}
public class Ques10
{
    public static void main(String[]args)
    {
        ScientificCalculator obj1=new ScientificCalculator();
        System.out.println("The sine value of a number is : "+obj1.sin(Math.toRadians(30));
        System.out.println("The SquareRoot value of a number is : "+obj1.squareRoot(36));
        System.out.println("The Modulus value of a number is : "+obj1.modulus(29,3));
        AdvancedCalculator obj2=new AdvancedCalculator();
        System.out.println("The exponent value of a number is : "+obj2.power(2,3));
        System.out.println("The Addition value is : "+obj2.add(3,4));
    }
}



