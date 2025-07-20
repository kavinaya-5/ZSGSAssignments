import java.util.Scanner;
public class Ques6
{
public static void main(String []args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the number" );
int n=in.nextInt();
String binary=binaryConversion(n);
System.out.println("The Binary Number Is:" +binary);
}
public static String binaryConversion(int n)
{
StringBuilder sol=new StringBuilder();
while(n>0)
{
int l=n&1;
sol.append(l);
n=n>>1;
}
return sol.reverse().toString();
}
}