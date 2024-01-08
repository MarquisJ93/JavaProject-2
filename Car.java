package JavaProject2;

public abstract class Car {
    private double carPrice;
    private String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }
    public double calculateSalePrice(){
        return carPrice;
    }
}
class Sedan extends Car{
    private double length;
    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }
    @Override
    public double calculateSalePrice() {
        if(length>20){
            return super.calculateSalePrice()*.95;
        }else{
            return super.calculateSalePrice()*.90;
        }
    }
}
class Truck extends Car{
    private double weight;
    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    public double calculateSalePrice(){
        if(weight>2000){
            return super.calculateSalePrice()*.90;
        }else{
            return super.calculateSalePrice()*.80;
        }
    }
}
class CarTester{
    public static void main(String[] args) {
        Truck t=new Truck(10000,"Red",1999);
        Sedan s=new Sedan(12000,"Silver",21);
        System.out.println("Sale price of Truck is $"+t.calculateSalePrice());
        System.out.println("Sale price of Sedan is $"+s.calculateSalePrice());
    }
}
