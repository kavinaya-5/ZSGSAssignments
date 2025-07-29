package Day6;
import Day6.Arithmetic.Operations;
import Day6.StringUtils.Performance;
public class Ques2 {
    public static void main(String[] args) {
        Operations op=new Operations();
        Performance string =new Performance();
        System.out.println("Addition of two numbers is: "+op.add(2,3));
        System.out.println("Subtraction of two numbers is: "+op.subtraction(5,2));
        System.out.println("Multiplication of two numbers is: "+op.multiplication(4,5));
        System.out.println("Division of two numbers is: "+op.division(40,10));
        System.out.println("Modulo of Two numbers is : "+op.modulo(8,3));
        System.out.println("Concatenation of two strings is :"+ string.performConcatenation("Hello","Good morning"));
        System.out.println("Reversing String : "+string.peformReversing("Kavinaya"));
        System.out.println("Length of the string is:"+string.calculateLength("Good to see you"));
}
}