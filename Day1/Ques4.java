import java.util.Scanner;
public class Ques4
{
public static void main(String []args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the two numbers:");
int a=input.nextInt();
int b=input.nextInt();
Boolean isSame=((a&b)==0)?true:false;
System.out.print(isSame);
}
}