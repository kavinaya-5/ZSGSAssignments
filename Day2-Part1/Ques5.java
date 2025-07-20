import java.util.Scanner;
public class Ques5
{
public static void main(String []args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the number range:");
int n=input.nextInt();
int ans=0;
for(int i=0;i<n;i++)
{
if((i&1)==0)
{
ans+=i;
}
else
{
continue;
}
}System.out.println("The Sum Of Even Numbers Is:" +ans);
}
}