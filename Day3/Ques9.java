class MyString
{
    private String name;
    MyString (String name)
    {
        this.name=name;
    }
public int length()
{
    int length=0;
    for(int i=0;i<name.length();i++)
    {
        length++;
    }
    return length;
}
public char CharAt(int index)
{
    for(int i=0;i<name.length();i++)
    {
        if(i==index)
        {
            return name.charAt(i);
        }

    }
    return ' ';
}
public boolean equals(String other)
{
    int p=0;
    int q=0;
    char []a=new char[name.length()];
    char []b=new char[other.length()];
    for(int i=0;i<name.length();i++)
    {
        a[i]=name.charAt(i);
    }
    for(int j=0;j<other.length();j++)
    {
        b[j]=other.charAt(j);
    }
    while(p<name.length() && q<other.length())
    {
        if(a[p]!=b[q])
        {
            return false;
        }
        else
        {
            p++;
            q++;
        }
    }
    return p==name.length() && q==other.length();
}
public String stringToUpperCase()
{
    StringBuilder sol=new StringBuilder();
    for(int i=0;i<name.length();i++)
    {
        if(name.charAt(i)>='a' && name.charAt(i)<='z')
        {
            sol.append((char)(name.charAt(i)-32));
        }
        else
        {
            sol.append(name.charAt(i));
        }
    }
    return sol.toString();
}
public String stringToLowerCase()
{
    StringBuilder sol=new StringBuilder();
    for(int i=0;i<name.length();i++)
    {
        if(name.charAt(i)>='A' && name.charAt(i)<='Z')
        {
            sol.append((char)(name.charAt(i)+32));
        }
        else
        {
            sol.append(name.charAt(i));
        }
    }
    return sol.toString();
}
public String Substring(int start,int end)
{
    StringBuilder sol=new StringBuilder();
    for(int i=start;i<end;i++)
    {
        sol.append(name.charAt(i));
    }
    return sol.toString();
}
public String conCat(String newOne)
{
    StringBuilder sol=new StringBuilder();
    for(int i=0;i<name.length();i++)
    {
        sol.append(name.charAt(i));
    }
    for(int j=0;j<newOne.length();j++)
    {
        sol.append(newOne.charAt(j));
    }
    return sol.toString();
}
public Boolean contains(String sub)
{
    int index=-1;
    for(int i=0;i<name.length();i++)
    {
        if(sub.charAt(0)==name.charAt(i))
        {
            index=i;
            break;
        }
    }
    int p=0;
    for(int i=index;i<name.length();i++)
    {
        if(sub.charAt(p)==name.charAt(i))
        {
            continue;
        }
        else {
            break;
        }
    }
    return p==sub.length();
}
public int indexOf(char ch)
{
    for(int i=0;i<name.length();i++)
    {
        if(name.charAt(i)==ch)
        {
            return i;
        }
    }
    return -1;
}
public String replace(char oldchar,char newchar)
{
    StringBuilder sol=new StringBuilder();
    for(int i=0;i<name.length();i++)
    {
        if(name.charAt(i)==oldchar)
        {
            sol.append(newchar);
        }
        else
        {
            sol.append(name.charAt(i));
        }
    }
    return sol.toString();
}
}


public class Ques9
{
    public static void main(String []args)
    {
        MyString obj=new MyString("Hello");
        System.out.println("The Length of the string is: "+obj.length());
        System.out.println("The Character at the particular index  of the string is: "+obj.CharAt(2));
        System.out.println("The String equal is: "+obj.equals("hello"));
        System.out.println("The Uppercase  of the string is: "+obj.stringToUpperCase());
        System.out.println("The LowerCase  of the string is: "+obj.stringToLowerCase());
        System.out.println("The Substring  of the string is: "+obj.Substring(1,3));
        System.out.println("The Concatenation  of the string is: "+obj.conCat(" Good Morning"));
        System.out.println("The Index of the string at the particular Character is: "+obj.indexOf('o'));
        System.out.println("The Replace of the string is: "+obj.replace('o','p'));
    }
}










