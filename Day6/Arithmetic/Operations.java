package Day6.Arithmetic;
public class Operations {
   public int add(int a,int b)
    {
        return a+b;
    }
    public int subtraction(int a,int b)
    {
        return a-b;
    }
    public int multiplication(int a,int b)
    {
        return a*b;
    }
    public int division(int a,int b)
    {
        int flag=0;
        if(b==0)
        {
            System.out.println("Invalid number ! Provide a proper number");
            flag=1;
        }
       return flag==0?a/b:-1;
    }
    public int modulo(int a,int b)
    {
        return a%b;
    }
}
