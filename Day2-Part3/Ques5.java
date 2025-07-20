public class Ques5
{
public static void main(String []args)
{
 String s="axc";
String t="ahbgdc";
System.out.println(VerifyingWhethersIsSubsequenceOft(s,t));
}
public static Boolean VerifyingWhethersIsSubsequenceOft(String s,String t)
{
int i=0;
int j=0;
while(i<s.length() && j<t.length())
{
if(s.charAt(i)==t.charAt(j))
{
i++;
j++;
}
else
{j++;
}
}
return i==s.length();
}}
