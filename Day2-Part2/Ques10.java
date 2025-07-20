import java.util.*;
public class Ques10
{
public static void main(String []args)
{
Scanner in = new Scanner(System.in);
        System.out.println("Enter the row and column size :");
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the values:");
        System.out.println("\n ---------- inputting the elements-----\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("\n ---------- displaying the elements-----\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        System.out.println("\n ---------- sum of all the elements-----\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("sum of all the elements:" +sum);
        System.out.println("\n ---------- Rowwise  sum-----\n");
        for (int i = 0; i < arr.length; i++) {
            int sum1 = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum1 += arr[i][j];
            }
            System.out.println("Row sum of " + i + "is :" + sum1);
        }
        System.out.println("\n ---------- columnwise  sum-----\n");
        for (int i = 0; i < arr[0].length; i++) {
            int sum1 = 0;
            for (int j = 0; j < arr.length; j++) {
                sum1 += arr[j][i];
            }
            System.out.println("Column sum of " + i + "is :" + sum1);
        }
        System.out.println("\n ---------- Transpose of a matrix-----\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;

            }
        }
        System.out.println(Arrays.deepToString(arr));


}
}




