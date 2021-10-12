/**
 * An abstract representation of a car with standard fields.
 * The class implements the Drivable interface
 */

public abstract class Car implements Drivable {

    protected int licensePlate;
    protected String make;
    protected String model;

    /**
     * An example of an abstract method that must be implemented by subclasses 
     */
    public abstract void honk();


}
