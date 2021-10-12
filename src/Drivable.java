/**
 * A simple implementation of a Drivable interface. The two methods should be implemented by any Drivable.
 * An interface has no fields, unlike an abstract class.
 */
public interface Drivable {
    /**
     * Example of a default method.
     */
    default void accelerate(){
        System.out.println("Nothing is implemented, so I go slow.");
    }

    /**
     * Example of a "normal" interface-method, which MUST be implemented by sub-classes
     */
    public void brake();
    
}
