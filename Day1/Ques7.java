import java.util.Scanner;
public class Ques7
{
public static void main(String []args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the number:");
int a=input.nextInt();
int ones=0;
while(a>0)
{
int last=a&1;
if(last==1)
{
ones++;
}
a=a>>1;
}
boolean answer=ones==1?true:false;
System.out.println(answer);
}
}