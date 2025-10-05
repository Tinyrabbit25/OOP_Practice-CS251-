public class Car {

    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 1999.9;
    boolean is_running = false;

    void start(){
        is_running = true;
        System.out.println("You start the engine");
    }

    void stop(){
        is_running = false;
        System.out.println("You stop the engine");
    }

    void drive(){
        System.out.println("You drive the " + model);
    }

    void brake(){
        System.out.println("You brake the " + model);
    }

}