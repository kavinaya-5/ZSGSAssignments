public class Ques1{
static int a=11;  // static variables
int b=9; // instance  variables
public static void main(String []args)
{
final int  z=15; // final variables
for(int i=0;i<5;i++) // block variable
{
int q=0; // local variables
System.out.println(q+i);
}
System.out.print(a);
System.out.print(z);
}
}
