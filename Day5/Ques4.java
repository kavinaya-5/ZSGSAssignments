//4. Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common method but implement booking differently.
abstract class Ticket
{
    String name;
    int age;
    String aadharNumber;
    Ticket(String name,int age,String aadharNumber)
    {
        this.name=name;
        this.age=age;
        this.aadharNumber=aadharNumber;
    }
    void displayrecord()
    {
        System.out.println("Name of the passesnger is: "+name +"\n Age of the passenger is : "+age+"\n aadhar number of the passenger is: "+aadharNumber);
    }
   abstract void bookTicket();
}
class Bus extends Ticket{
    int numberOfSeats;
    boolean isAirconditioner;
    Bus(String name,int age,String aadharNumber,int numberOfSeats,boolean isAirconditioner)
    {
        super(name,age,aadharNumber);
        this.isAirconditioner=isAirconditioner;
        this.numberOfSeats=numberOfSeats;
    }
    void displayrecord()
    {
        super.displayrecord();
        System.out.println("Number Of seats is :"+numberOfSeats +"\nIs airconditioner needed? "+isAirconditioner);
    }
    void bookTicket(){
        System.out.println("Bus Ticket Booked successfully");
    }
}
class Train extends Ticket{
    String trainName;
    String coachType ;
    int seatNumber;
    Train(String name,int age,String aadharNumber,String trainName,String coachType,int seatNumber)
    {
        super(name,age,aadharNumber);
        this.trainName=trainName;
        this.coachType=coachType;
        this.seatNumber=seatNumber;
    }
    void bookTicket()
    {
        System.out.println("Train Ticket Booked Successfully");
    }
    void displayrecord()
    {
        super.displayrecord();
        System.out.println(" NAme of the tarin is :"+trainName +"\n coach type is: "+coachType+"\n seat number of the train :"+seatNumber);
    }
}
class Flight extends  Ticket
{
    String flightNumber;
    String classType ;
    String seatNumber;
    Flight(String name,int age,String aadharNumber,String flightNumber,String classType,String seatNumber)
    {
        super(name, age, aadharNumber);
        this.flightNumber=flightNumber;
        this.classType=classType;
        this.seatNumber=seatNumber;
    }
    void bookTicket()
    {
        System.out.println("Flight Ticket Booked Successfully");
    }
    void displayrecord()
    {
        super.displayrecord();
        System.out.println("Flight number is: "+flightNumber+"\n class type of the flight is: "+classType+"\n seat number of the  flight is :"+seatNumber);
    }
}
public class Ques4
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
