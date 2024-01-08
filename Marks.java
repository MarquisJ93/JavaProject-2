package JavaProject2;

public abstract class Marks {
    abstract double getPercentage();
}
class StudentA extends Marks {
    private double math, english, history;
    public StudentA(double math, double english, double history) {
        this.math = math;
        this.english = english;
        this.history = history;
    }
    double getPercentage(){
        return (math+english+history)/3;
    }
}
class StudentB extends Marks{
    double math,history,spanish,english;
    public StudentB(double math, double history, double spanish, double english) {
        this.math = math;
        this.history = history;
        this.spanish = spanish;
        this.english = english;
    }

    @Override
    double getPercentage() {
        return (math+history+spanish+english)/4;
    }
}
class MarksTester{
    public static void main(String[] args) {
        StudentA a=new StudentA(91,83,79);
        StudentB b=new StudentB(89,90,77,81);
        System.out.println("The average marks for Student A are "+a.getPercentage());
        System.out.println("The average marks for Student B are "+b.getPercentage());
    }
}