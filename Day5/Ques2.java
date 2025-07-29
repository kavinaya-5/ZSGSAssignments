//2. Can we override private method, constructor, static method, final method? Illustrate with an example.
// it shows this error Ques2.java:20: error: sound() has private access in Puppy
class Dog{
    Dog()
    {
        System.out.println("Hello we are in Dog class");
    }
    private void sound()
    {
        System.out.println("Who Who");
    }
    static void isBark()
    {
        System.out.println("Yes dog Barks");
    }
    final void eat()
    {
        System.out.println("Dog eats");
    }
}
class Puppy extends Dog
{
    Puppy(){
        System.out.println("Hello! we are in puppy class");
    }

    private void sound()
    {
        System.out.println("Whof Whof");
    }
    static void isBark()
    {
        System.out.println("yes  puppy barks");
    }
    void eat()
    {
        System.out.println("Puppy eats");
    }
}
class Ques2
{
    public static void main(String []args)
    {
        Dog puppy=new Puppy();
//puppy.sound();
        puppy.eat();
        puppy.isBark();
    }
}