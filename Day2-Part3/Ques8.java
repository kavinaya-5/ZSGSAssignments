public class Ques8
{
public static void main(String []args)
{
 String s="usa";
        int flag=0;
        if(s.charAt(0)>='A' && s.charAt(0)<='Z')
        {
            if(s.charAt(1)>='A' && s.charAt(1)<='Z') {
                for (int i = 1; i < s.length(); i++) {
                    if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                        continue;
                    } else {
                        flag = 1;
                        break;
                    }
                }
            }
            else {
                for (int i = 1; i < s.length(); i++) {
                    if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                        continue;
                    } else {
                        flag = 1;
                        break;
                    }
                }
            }
        }
        if(flag==1 || s.charAt(0)>='a' && s.charAt(0)<='z')
        {
            for(int i=1;i<s.length();i++ )
            {
                if(s.charAt(i)>='a' && s.charAt(i)<='z')
                {
                    continue;
                }
                else {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("False");
        }
        else {
            System.out.println("True");
        }
    }
}
