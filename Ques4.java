class FastFood
{
String foodName="momos";
}
class HealthyFood{
String foodName="Pulses";
}
class Human extends FastFood,HealthyFood{
void likesToEat()
{
System.out.println("I likes to eat"+ foodName);
}
}
public class Ques4
{
public static void main(String []args)
{
Human obj1=new Human();
obj1.likesToEat();
}
}