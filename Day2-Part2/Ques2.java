import java .util.Scanner;
public class Ques2
{
public static void main(String []args)
{
 Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 values:");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The prime numbers are:");
        for (int i = 0; i < arr.length; i++) {

            if (isPrime(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;
}
}

