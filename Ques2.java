class TwoD{
int x;
int y;
TwoD()
{
System.out.println("Default constructor");
}
void setTwoCoordinates(int x,int y)
{
this.x=x;
this.y=y;
}
int getX()
{
return this.x;
}
int getY()
{
return this.y;
}
}
class ThreeD{
int z;
ThreeD(int x,int y,int z)
{
System.out.println("Parameterized Constructor");
this.x=x;
this.y=y;
this.z=z;
}
void setz(int z)
{
this.z=z;
}
int setz()
{
return z;
}
public double distance(ThreeD a)
{
int a=other.x-this.x;
int b=other.y-this.y;
int c=other.z-this.z;
int p=a*a+b*b+c*c;
return Math.sqrt(p);
}
}
class Ques2
{
public static void main(String ...args)
{
ThreeD point1=new ThreeD();
point1.setTwoCoordinates(1,2);
point1.setz(3);
ThreeD point2=new ThreeD(4,5,6);
double result=point1.distance(ThreeD point2);
System.out.println("The Distance between two points is: "+result);
}
}


