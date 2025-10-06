public class Main {
    public static void main (String [] args) {

        Car car1 = new Car("Ford","Mustang",2025, "red");
        Car car2 = new Car("Audi","S2",2025, "black");


        System.out.println(car1);
        System.out.println(car2);
        Car.track();

    }
}