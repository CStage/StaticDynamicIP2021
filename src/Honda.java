/**
 * An example of a concrete class, implementing the abstract class Car
 */
public class Honda extends Car {

    public Honda(String model, int licensePlate) {
        this.make = "Honda";
        this.model = model;
        this.licensePlate = licensePlate;
    }

    @Override
    public void accelerate() {
        System.out.println("Vroom, I'm a fast Honda");

    }

    @Override
    public void brake() {
        System.out.println("I'll stop on a dime. That's Japanese engineering for you.");

    }

    @Override
    public void honk() {
        System.out.println("*BEEEEEEEEP*");

    }

    public void drift() {
        System.out.println("Skrrrt");
    }

    public void a() {
        System.out.println("honda!");
    }
    
}
