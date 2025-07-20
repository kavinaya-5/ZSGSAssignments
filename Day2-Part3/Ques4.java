public class Ques4
{
public static void main(String []args)
{
String s="";
String t="y";
System.out.println(shufflingIsPresent(s,t));
}
public static String shufflingIsPresent(String s,String t)
{
int []freq=new int[26];
int []freq2=new int[26];
for(int i=0;i<s.length();i++)
{
freq[s.charAt(i)-'a']++;
}
for(int j=0;j<t.length();j++)
{
freq2[t.charAt(j)-'a']++;
}
StringBuilder sol=new StringBuilder();
for(int i=0;i<freq.length;i++)
{
if(freq[i]!=freq2[i])
{
sol.append((char)(i+97));
}
}
return sol.toString();
}
}