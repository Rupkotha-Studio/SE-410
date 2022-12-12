package se;
abstract class Shape<T>{
    abstract T area();
}
class Circle extends Shape<Double>
{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    Double area() {
        return (Math.PI*radius*radius);
    }
}
class Triangle extends Shape<Double>{
    private double height,width;
    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    @Override
    Double area() {
        return (height*width)/2;
    }
}
class Rectangle extends Shape<Double>{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    Double area() {
        return length*width;
    }
}
//Driver Class
public class Answer_6 {
    public static void main(String[] args) {
        System.out.println(new Circle(2.5).area());
        System.out.println(new Rectangle(2.5,1.7).area());
        System.out.println(new Triangle(2.5,3.2).area());
    }
}
