import java.util.Scanner;
public class Ques9
{
public static void main(String []args)
{
Scanner in=new Scanner(System.in);
int [][]arr=new int[10][4];
System.out.println("Enter 10 values:");
int sum=0;
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[0].length;j++)
{
arr[i][j]=in.nextInt();
}
}
for(int i=0;i<arr.length;i++)
{
int total=0;
for(int j=1;j<arr[0].length;j++)
{
total+=arr[i][j];
}
System.out.println("the roll no is:"+arr[i][0]);
System.out.println("The total is :"+total);
System.out.println("the average is :"+total/3);
}
}
}
