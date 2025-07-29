//5. Develop a Java application for a Ticket Booking System that allows users to book tickets for different types of transportation modes such as *Bus*, *Train*, and *Flight*.
Define a common interface or abstract class `Ticket` with a method `bookTicket()` that each transportation mode must implement differently.
Create classes `BusTicket`, `TrainTicket`, and `FlightTicket` that extend the abstract class or implement the interface.
Demonstrate *runtime polymorphism* by calling the `bookTicket()` method using a reference of the base class/interface.
interface Ticket
{
   abstract void displayrecord();

    abstract void bookTicket();
}
class Bus implements Ticket{
    int numberOfSeats;
    boolean isAirconditioner;
    String name;
    int age;
    String aadharNumber;
    Bus(String name,int age,String aadharNumber,int numberOfSeats,boolean isAirconditioner)
    {
        this.name=name;
        this.age=age;
        this.aadharNumber=aadharNumber;
        this.isAirconditioner=isAirconditioner;
        this.numberOfSeats=numberOfSeats;
    }
   public void displayrecord()
    {
        System.out.println("Name of the passesnger is: "+name +"\n Age of the passenger is : "+age+"\n aadhar number of the passenger is: "+aadharNumber);
        System.out.println("Number Of seats is :"+numberOfSeats +"\nIs airconditioner needed? "+isAirconditioner);
    }
   public void bookTicket(){
        System.out.println("Bus Ticket Booked successfully");
    }
}
class Train implements Ticket{
    String trainName;
    String coachType ;
    int seatNumber;
    String name;
    int age;
    String aadharNumber;
    Train(String name,int age,String aadharNumber,String trainName,String coachType,int seatNumber)
    {
       this.name=name;
       this.age=age;
       this.aadharNumber=aadharNumber;
        this.trainName=trainName;
        this.coachType=coachType;
        this.seatNumber=seatNumber;
    }
   public void bookTicket()
    {

        System.out.println("Train Ticket Booked Successfully");
    }
   public void displayrecord()
    {
        System.out.println("Name of the passesnger is: "+name +"\n Age of the passenger is : "+age+"\n aadhar number of the passenger is: "+aadharNumber);
        System.out.println(" NAme of the tarin is :"+trainName +"\n coach type is: "+coachType+"\n seat number of the train :"+seatNumber);
    }
}
class Flight implements Ticket
{
    String flightNumber;
    String name;
   int age;
    String aadharNumber;
    String classType ;
    String seatNumber;
    Flight(String name,int age,String aadharNumber,String flightNumber,String classType,String seatNumber)
    {
        this.name=name;
        this.age=age;
        this.aadharNumber=aadharNumber;
        this.flightNumber=flightNumber;
        this.classType=classType;
        this.seatNumber=seatNumber;
    }
   public void bookTicket()
    {
        System.out.println("Flight Ticket Booked Successfully");
    }
   public void displayrecord()
    {
        System.out.println("Name of the passesnger is: "+name +"\n Age of the passenger is : "+age+"\n aadhar number of the passenger is: "+aadharNumber);
        System.out.println("Flight number is: "+flightNumber+"\n class type of the flight is: "+classType+"\n seat number of the  flight is :"+seatNumber);
    }
}
public class Ques5
{
    public static void main(String []args)
    {
        System.out.println("------ bus ticket------");
        Ticket bus=new Bus("Naga",22,"90875482973",2,true);
        bus.bookTicket();
        bus.displayrecord();
        System.out.println("----- train ticket------");
        Ticket train=new Train("vvn",23,"76473647","pallavan","sleeper",34);
        train.bookTicket();
        train.displayrecord();
        System.out.println("----- flight ticket------");
        Ticket flight=new Flight("niranj",33,"987656327","Ai-56","Economy","43");
        flight.bookTicket();
        flight.displayrecord();
    }
}

