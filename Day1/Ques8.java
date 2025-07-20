import java.util.Scanner;
public class Ques8
{
public static void main(String []args)
{
Scanner input=new Scanner(System.in);
System.out.println("enter the number:");
int a=input.nextInt();
int position=1;
while(a>0)
{
int last=a&1;
if(last==1)
{
break;
}
a=a>>1;
position++;
}
System.out.println("the position of the set bit is:" + position);
}
}

