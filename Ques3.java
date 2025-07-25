class Point{
    private int x;
    private int y;
    Point()
    {
        x=0;
        y=0;
    }
    void setpoint(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
    void printPoint()
    {
        System.out.println("The value of x:"+getX());
        System.out.println("The value of Y:"+getY());
    }
}
class Circle extends Point {
    private int radius;

    public Circle() {

    }
    void SetRadius(int radius)
    {
        this.radius = radius;
    }
    int getRadius()
    {
        return radius;
    }
    double area()
    {
        printPoint();
        int r;
        if (getRadius() < 0) {
            r = 1;
        } else {
            r = getRadius();
        }
        return 3.14 * r * r;
    }
}
public class Ques3 {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.setpoint(2,3);
        circle.SetRadius(1);
        double ans=circle.area();
        System.out.println("the area of the circle:"+ans);

    }
}