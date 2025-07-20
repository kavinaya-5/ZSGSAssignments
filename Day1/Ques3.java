import java.util.Scanner;
public class Ques3
{
public static void main(String []args)
{
Scanner in =new Scanner(System.in);
System.out.println("Enter the Two Values: ");
int a=in.nextInt();
int b=in.nextInt();
int ans=a>b?a:b;
System.out.println("the answer is:" +ans);
}
}
