package java_practise;

import static java.lang.Math.PI;


public class Cylinder implements face1, face2
{
    private double radius;
    private double height;
    public Cylinder (double r, int h)
    {
        radius = r;
        height = h;
    }
    public double area()
    {
        return PI * radius * radius;
    }
    public void volume()
    {
        System.out.println("圆柱体体积 = " +area() * height);
    }
    public static void main(String []  args)
    {
        Cylinder volu = new Cylinder(5.0,1);
        volu.volume();
    }
}
interface face1
{
    final double PI = 3.14;
    abstract double area();
}
interface face2
{
    abstract void volume();
}

