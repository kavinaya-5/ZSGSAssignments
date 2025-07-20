import java.util.Scanner;
public class Ques6
{
public static void main(String []args)
{
Scanner in=new Scanner(System.in);
int []arr={1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
System.out.println("Enter your year of graduation:");
int yearOfGraduation=in.nextInt();
if(binarySearch(arr, yearOfGraduation))
{
System.out.println("Record Exist");
}
else
{
System.out.println("Record not  Exist");
}
}
public static Boolean binarySearch(int []arr,int target)
{
int start=0;
int end=arr.length-1;
while(start<=end)
{
int mid=start+(end-start)/2;
if(arr[mid]==target)
{
return true;
}
else if(arr[mid]>target)
{
end=mid-1;
}
else
{
start=mid+1;
}
}
return false;
}
}