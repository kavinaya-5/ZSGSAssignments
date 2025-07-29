package Day6.StringUtils;
public class Performance {
    public String performConcatenation(String a,String b)
    {
        return a+b;
    }
    public String peformReversing(String a)
    {
        char []ch=a.toCharArray();
        for(int i=0;i<ch.length/2;i++)
        {
            char temp=ch[i];
            ch[i]=ch[ch.length-1-i];
            ch[ch.length-1-i]=temp;
        }
        StringBuilder sol=new StringBuilder();
        for(int j=0;j<ch.length;j++)
        {
            sol.append(ch[j]);
        }
        return sol.toString();
    }
    public int calculateLength(String a)
    {
       int count=0;
       for(char ch:a.toCharArray())
       {
           count++;
       }
       return count;
    }

}
