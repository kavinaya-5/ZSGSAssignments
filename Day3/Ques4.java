class Vehicle {
String vehicle_name;
String brand_name;
double price;
static int count=0;
Vehicle(String vehicle_name,String brand_name,double price)
{
this.vehicle_name=vehicle_name;
this.brand_name=brand_name;
this.price=price;
Vehicle.count+=1;
}
void display()
{
System.out.println("Name of the vehicle is: " +this.vehicle_name);
System.out.println("Brand of the vehicle is: " +this.brand_name);
System.out.println("Price of the vehicle is: " +this.price);

}
}
public class Ques4
{
public static void main(String []args)
{
Vehicle obj=new Vehicle("Scooty","Fascino",100000000);
Vehicle obj2=new Vehicle("Scooty","Zest",1000009);
obj.display();
System.out.println("Count of the vehicle is :" +Vehicle.count);
}
}