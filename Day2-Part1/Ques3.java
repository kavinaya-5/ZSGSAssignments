public class Ques3
{
public static void main(String []args)
{
int n=5;
int num=1;
int i=0;
while(i<5)
{
int j=0;
if(i<n/2)
{
while(j<=i)
{
System.out.print(num+" ");
num++;
j++;
}
}
else
{
while(j<n-i)
{
System.out.print(num+" ");
num++;
j++;
}
}
System.out.println();
i++;
}
System.out.print("\n --------------------- option b -----------------\n");

int row=0;
while(row<5)
{
int j=0;
if(row<n/2)
{
while(j<=row)
{
System.out.print("w"+" ");
j++;
}
}
else
{
while(j<n-row)
{
System.out.print("w"+" ");
j++;
}
}
System.out.println();
row++;
}

}
}