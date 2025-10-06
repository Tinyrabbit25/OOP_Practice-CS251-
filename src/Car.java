public class Car {

    String make;
    String model;
    int year;
    String color;
    static int num;

    public Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        num++;
    }

    static void track(){
        System.out.println("You have " + num + " Cars");
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }




}
