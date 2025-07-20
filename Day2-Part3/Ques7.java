import java .util.Arrays;
public class Ques7
{
public static void main(String []args)
{
 String s="Hello,my name is john";
String[] arr = s.split("[\\s,\\-\\+\\$\\?\\.@&]+");
System.out.println(Arrays.toString(arr));
System.out.println("The number of segmenst in the string is: "+arr.length);
}
}
