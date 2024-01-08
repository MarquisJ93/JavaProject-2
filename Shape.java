package JavaProject2;

public interface Shape {
    double calculateArea();
    double calculatePerimeter();

}
class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (Math.PI*radius*radius);
    }

    @Override
    public double calculatePerimeter() {
        return (radius*Math.PI*2);
    }
}
class Square implements Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (2*side);
    }

    @Override
    public double calculatePerimeter() {
        return (4*side);
    }
}
class ShapeTester {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        Square s = new Square(4);
        System.out.println("The area of circle is: " + c.calculateArea());
        System.out.println("The perimeter of circle is: " + c.calculatePerimeter());
        System.out.println("The area of square is: " + s.calculateArea());
        System.out.println("The perimeter of square is: " + s.calculatePerimeter());
    }
}
