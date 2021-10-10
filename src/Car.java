/**
 * An abstract representation of a car with standard fields.
 * The class implements the Vehicle interface
 */

public abstract class Car implements Vehicle {

    protected int licensePlate;
    protected String make;
    protected String model;

    /**
     * An example of an abstract method that must be implemented by subclasses 
     */
    public abstract void honk();


}
