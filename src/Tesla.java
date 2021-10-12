public class Tesla extends Car{
    
    private String honk;

    public Tesla(String model, int licensePlate, String honk) {
        this.make = "Tesla";
        this.model = model;
        this. licensePlate = licensePlate;
        this.honk = honk;
    }

    @Override
    public void accelerate() {
        System.out.println("I'm all silent when I accelerate");

    }

    @Override
    public void brake() {
        System.out.println("I'm all silent when I brake");

    }

    @Override
    public void honk() {
        System.out.println("My custom honk is: " + this.honk);

    }

    public void charge() {
        System.out.println("I'm an electrical car, so I'll charge now.");
    }
    
}
