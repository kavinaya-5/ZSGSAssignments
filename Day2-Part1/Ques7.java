import java.util.Scanner;
public class Ques7
{
public static void main(String []args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the percent:");
int percent=in.nextInt();
int z=0;
if(percent>=85 && percent<=100)
{
System.out.println("Grade A");
z=1;
}
else if( percent>=70)
{
System.out.println("Grade B");
z=2;
}
else if(percent >=50)
{
System.out.println("Grade C");
z=3;
}
else
{
System.out.println("Fail ");
z=4;
}
// using Switch case
int p=percent/10;
switch(z)
{
case 1:
System.out.println("Grade A"); break;
case 2:
System.out.println("Grade B"); break;
case 3:
System.out.println("Grade C"); break;
default:
System.out.println("Fail"); break;
}
}
}