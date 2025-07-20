public class Ques3
{
public static void main(String []args)
{
 String s="hello";
        char[] ch=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(isVowel(ch[i]) && isVowel(ch[j]))
            {
                char p=ch[i];
                ch[i]=ch[j];
                ch[j]=p;
                i++;
                j--;
            }
            else if(isVowel(ch[i]) && (!isVowel(ch[j])))
            {
                j--;}
            else {
                i++;
            }
        }
        StringBuilder sol=new StringBuilder();
for(int k = 0; k <ch.length; k++)
        {
        sol.append(ch[k]);
}
        System.out.println(sol);
    }
    public static boolean isVowel(char ch)
    {
        return ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u';
    }

}