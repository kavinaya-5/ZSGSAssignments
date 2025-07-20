import java.util.Scanner;
public class Ques8
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
}
int sum1=0;
int sum2=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]<18)
{
sum++;
}
else if(arr[i]>=18 && arr[i]<=60)
{
sum1++;
}
else
{
sum2++;
}
}
System.out.println("Ages less than 18 :"+sum);
System.out.println("ages in between 18 and 60 :"+sum1);
System.out.println("Ages greater then 60 :"+sum2);
}
}
