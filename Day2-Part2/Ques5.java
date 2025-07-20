public class Ques5
{
public static void main(String []args)
{
char []x={'m','n','o','p'};
char []y={'m','n','o','p'};
int []freq1=new int[26];
int []freq2=new int[26];
for(int i=0;i<x.length;i++)
{
freq1[x[i]-'a']++;
}
for(int j=0;j<y.length;j++)
{
freq2[y[j]-'a']++;
}
int flag=0;
for(int k=0;k<26;k++)
{
if(freq1[k]!=freq2[k])
{
flag=1;
System.out.println("The arrays are not identical");
}
}
if(flag==0)
{
System.out.println("The arrays are identical");
}
}
}
