public class Bicycle implements Vehicle {
    private String make;
    private int bikeNo;

    public Bicycle(String make, int bikeNo) {
        this.make = make;
        this.bikeNo = bikeNo;
    }

    public void accelerate() {
        System.out.println("I'm moving at bike-speed");
    }

    public void brake() {
        System.out.println("I'm braking, as a bike, cuz I'm a bike.");
    }

    public void ring() {
        System.out.println("*DING* *DING*");
    }
    
}
