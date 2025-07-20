
public class Ques4
{
public static void main(String []args)
{
System.out.println("Enter the row number:");
 int rows=5;
        int q=0;
        do {
//            System.out.print(1);
            int res=1;
            int j=0;
            do {
                System.out.print(res);
                res=res*(q-j);
                res=res/(j+1);
                j++;
            }
            while (j<q);
            if(q!=0) {
                System.out.println(1);
            }
            System.out.println();
            q++;
        }while (q<rows);
System.out.print("\n -------------------------------------------\n");
 String s = "ZohoCorporations";
        int p = 0;
        int i = 0;
        do {
            int j = 0;
            do {
                System.out.print(s.charAt(p++));
                j++;
            } while (j < 4);
            System.out.println();
            i++;
        } while (i < 4);
}
}
