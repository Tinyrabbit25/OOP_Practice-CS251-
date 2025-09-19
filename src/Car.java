public class Car {

        //Attributes
        String make = "Honda";
        String model = "Sedan";
        int year = 2025;
        double price = 58000.99;
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