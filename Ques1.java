class Vehicle{
    double mileage;
    int price;
    Vehicle(double mileage,int price)
    {
        this.mileage=mileage;
        this.price=price;
    }
    void display()
    {
        System.out.println("Mileage of car is: "+mileage);
        System.out.println("Price is:"+price);
    }
}
class Car extends Vehicle{
    int ownershipCost;
    int warranty;
    int seatingCapacity;
    String fuelType;
    Car(double mileage,int price,int ownershipCost,int warranty,int seatingCapacity,String fuelType)
    {
        super(mileage,price);
        this.ownershipCost=ownershipCost;
        this.warranty=warranty;
        this.seatingCapacity=seatingCapacity;
        this.fuelType=fuelType;
    }
    void displayCar()
    {
        super.display();
        System.out.println("OwnerShip cost is:"+ownershipCost);
        System.out.println("Warranty is :"+warranty);
        System.out.println("Seating capacity is:"+seatingCapacity);
        System.out.println("Fuel type is:"+fuelType);
    }
}
class Bike extends Vehicle{
    int numberOfCylinders;
    int numberOfGears;
    String coolingType;
    String wheelType;
    int fuelTankSize;
    Bike(double mileage,int price,int numberOfCylinders,int numberOfGears,String coolingType,String wheelType,int fuelTankSize)
    {
        super(mileage, price);
        this.numberOfCylinders=numberOfCylinders;
        this.numberOfGears=numberOfGears;
        this.coolingType=coolingType;
        this.wheelType=wheelType;
        this.fuelTankSize=fuelTankSize;
    }
    void displayBike()
    {
        super.display();
        System.out.println("Number Of Cylinders :"+numberOfCylinders);
        System.out.println("Number of gears :"+numberOfGears);
        System.out.println("Cooling type is:"+coolingType);
        System.out.println("Wheel type is:"+wheelType);
        System.out.println("Size of the fuel tank is:"+fuelTankSize);
    }
}
class Audi extends Car{
   String modelType;
    Audi(double mileage,int price,int ownershipCost,int warranty,int seatingCapacity,String fuelType,String modelType)
    {
        super(mileage,price,ownershipCost,warranty,seatingCapacity,fuelType);
        this.modelType=modelType;
    }
    void displayAudi()
    {
        super.displayCar();
        System.out.println("Model type of the car is:"+modelType);

    }

}
class Ford extends Car{
  String modelType;
    Ford(double mileage,int price,int ownershipCost,int warranty,int seatingCapacity,String fuelType,String modelType)
    {
        super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
       this.modelType=modelType;
    }
    void displayFord()
    {
        super.displayCar();
        System.out.println("ModelType of the car is:"+modelType);

    }
}
class Bajaj extends Bike{
   String makeType;
    Bajaj(double mileage,int price,int numberOfCylinders,int numberOfGears,String coolingType,String wheelType,int fuelTankSize,String maketype)
    {
        super(mileage,price,numberOfCylinders,numberOfGears,coolingType,wheelType,fuelTankSize);
        this.makeType=maketype;
    }
    void displayBajaj()
    {
        super.displayBike();
        System.out.println("Make type is:"+makeType);
    }
}
class TVS extends Bike {
   String makeType;

    TVS(double mileage, int price, int numberOfCylinders, int numberOfGears, String coolingType, String wheelType, int fuelTankSize, String makeType) {
        super(mileage, price, numberOfCylinders, numberOfGears, coolingType, wheelType, fuelTankSize);
        this.makeType=makeType;
    }

    void displayTVS() {
        super.displayBike();
        System.out.println("Make type is:" + makeType);
    }
}

public class Ques1{
    public static void main(String[] args) {
        System.out.println("\n------AUDI------\n");
        Audi audi=new Audi(65,100000,97000,2,2,"petrol","Audi a3");
        audi.displayAudi();
        System.out.println("\n----- FORD CAR---\n");
        Ford ford=new Ford(100,300000,400000,5,4,"Diesel","Ford d3");
        ford.displayFord();
        System.out.println("\n------BAJAJ -----\n");
        Bajaj bajaj =new Bajaj(45,200000,2,1,"AC","strikers",4,"metal");
        bajaj.displayBajaj();
        System.out.println("\n-------TVS------\n");
        TVS tvs=new TVS(50,200000,3,2,"Air conditioner","strike",5,"metal");
        tvs.displayTVS();
    }
}

