import java.util.Scanner;
public class Ques4
{
public static void main(String []args)
{
Scanner in=new Scanner (System.in);
System.out.print("Enter the array length:");
int len=in.nextInt();
int []arr=new int[len];
System.out.print("Enter the numbers:");
for(int i=0;i<arr.length;i++)
{
arr[i]=in.nextInt();
}
print(arr,len);
}
public static void print(int []arr,int len)
{
int sum=0;
for(int j=0;j<len;j++)
{
int digit=((int)((Math.log10(arr[j])))+1);
if(digit<=2)
{
sum+=arr[j];
}
}
System.out.println("the Sum is:"+sum);
}
}
