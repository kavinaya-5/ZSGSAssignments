public class Ques3
{
public static void main(String []args)
{
  int num=1;
 int i=0;
        int n=3;
        while(i<2*n-1) {
            int space = i <= n / 2 ? n - i - 1 : i - n + 1;
            int j = 0;
            while (j < space) {
                System.out.print(" ");
                j++;
            }
            int no = i <= n / 2 ? i + 1 : 2 * n - 1 - i;
            int k = 0;
            while (k < no) {
                System.out.print(num + " ");
                num++;
                k++;
            }
            i++;
            System.out.println();
        }


System.out.print("\n --------------------- option b -----------------\n");
int p=5;
    int row=0;
while(row<5)
    {
        int j=0;
        if(row<p/2)
        {
            while(j<=row)
            {
                System.out.print("w"+" ");
                j++;
            }
        }
        else
        {
            while(j<p-row)
            {
                System.out.print("w"+" ");
                j++;
            }
        }
        System.out.println();
        row++;
    }
}
}