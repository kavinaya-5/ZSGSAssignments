class Shape{
void display()
{
System.out.println("This is Shape");
}
}
class Polygon extends Shape{
void display()
{
System.out.println("Polygon is a  Shape");
}
}
class Rectangle extends Shape{
void display()
{
System.out.println("Rectangle is a  Shape");
}
}
class Triangle extends Shape{
void display()
{
System.out.println("Triangle is a  Shape");
}
}
class Square extends Shape{
void display()
{
System.out.println("Square is a rectangle");
}
}
public class Ques5
{
public static void main(String ...args)
{
Polygon obj1=new Polygon();
obj1.display();
Rectangle obj2=new Rectangle();
obj2.display();
Triangle obj3=new Triangle();
obj3.display();
Square obj4=new Square();
obj4.display();
}
}

/*Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon inheriting the Shape class with the same method that prints "Polygon is a shape". Create two other classes named Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. Again, make another class named Square having the same method which prints "Square is a rectangle".
Now, try calling the method by the object of each of these classes. */