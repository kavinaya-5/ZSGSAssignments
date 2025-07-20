import java.util.Scanner;
public class Ques1
{
public static void main(String []args)
{
Scanner in=new Scanner(System.in);
int []arr=new int[10];
System.out.println("Enter 10 values:");
int sum=0;
for(int i=0;i<arr.length;i++)
{
arr[i]=in.nextInt();
if((i&1)==1)
{
sum+=arr[i];
}
}
System.out.println("Sum of Odd Number is " +sum);
}
}