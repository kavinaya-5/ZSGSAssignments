import java.util.Scanner;
public class Ques1
{
public static void main(String []args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the three Numbers:");
int a=input.nextInt();
int b=input.nextInt();
int c=input.nextInt();
if(a<b && b<c)
{
System.out.println("the Smallest number is:"+a);
}
else if(b<c && b<a)
{
System.out.println("the Smallest number is:"+b);
}
else
{
System.out.println("the Smallest number is:"+c);
}
}
}