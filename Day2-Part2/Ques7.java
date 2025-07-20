import java.util.*;
public class Ques7
{
public static void main(String []args)
{
Scanner in=new Scanner(System.in);
int []arr=new int[10];
System.out.println("Enter 10 values:");
for(int i=0;i<arr.length;i++)
{
arr[i]=in.nextInt();
}
for(int i=0;i<arr.length;i++)
{
for(int j=i;j>0;j--)
{
if(arr[j]>arr[j-1])
{
int t=arr[j];
arr[j]=arr[j-1];
arr[j-1]=t;
}
}
}
System.out.print(Arrays.toString(arr));
}
}
