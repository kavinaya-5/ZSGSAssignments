import java.util.Arrays;
public class Ques3
{
public static void main(String []args)
{
int []arr=new int[30];
for(int i=0;i<30;i++)
{
arr[i]=fib(i);
}
System.out.println(Arrays.toString(arr));
}
public static int fib(int n)
{
if(n<=1)
{
return n;
}
return fib(n-1)+ fib(n-2);
}
}