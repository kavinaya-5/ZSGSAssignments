public class Ques2
{
public static void main(String []args)
{
int columnNumber=1;
StringBuilder res=new StringBuilder();
while(columnNumber>0)
{
columnNumber--;
char ch=(char)(columnNumber+'A');
res.append(ch);
}
System.out.println(res);
}
}