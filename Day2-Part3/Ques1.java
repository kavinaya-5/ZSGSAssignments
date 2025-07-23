public class Ques1
{
public static void main(String []args)
{
String num1="1010";
String num2="1011";
System.out.println(sumofTwoNumbers(num1,num2));
}
public static String sumofTwoNumbers(String a,String b)
{
int i=a.length()-1;
int j=b.length()-1;
int carry=0;
StringBuilder sol=new StringBuilder();
while(i>=0 || j>=0)
{
int sum=(a.charAt(i)-'0')+(b.charAt(j)-'0')+carry;
sol.append(String.valueOf(sum%2));
carry=sum/2;
i--;j--;
}
/*while(i>=0)
{
int sum=(a.charAt(i)-'0')+carry;
sol.append(String.valueOf(sum%2));
carry=sum/2;
i--;
}
while(j>=0)
{
int sum=(a.charAt(j)-'0')+carry;
sol.append(String.valueOf(sum%2));
carry=sum/2;
j--;
}*/
if(carry!=0)
{
sol.append(carry);
}
return sol.reverse().toString();
}
}