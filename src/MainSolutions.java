import java.util.ArrayList;

public class MainSolutions {

    public static void main(String[] args) {
        //Q1: Instantiating a car, is below statement legal? Why/Why not?
        //Car someCar = new Car();

        //Q2: Pick the legal statements
            Honda h = new Honda("Civic", 1337);
            Car c = new Tesla("S3", 1336, "some song");
            Vehicle v1 = new Bicycle("Mosquito", 10);

            Vehicle v2 = h;
            Vehicle v3 = c;
            //Bicycle b1 = v1;
        
        //Q3: Say I have the objects below and I want them in one collection, how do I do it?
            Honda H = new Honda("Civic", 521462185);
            Tesla T = new Tesla("Model 3", 112233445, "Star Spangled Banner");
            Bicycle B = new Bicycle("Mosquito", 11245);

            ArrayList<Vehicle> arr = new ArrayList<Vehicle>();
            arr.add(H); arr.add(T); arr.add(B);
            //Static typing makes it so that we can call Vehicle's methods in the foreach, but not
            //anything else. 
        
        //Q4: Say I want all my vehicles to accelerate(). How do I do it?
            //Static typing makes it so that we can call Vehicle's methods in the foreach, but not
            //anything else. 
            System.out.println("Let's make everything accelerate \n");
            for (Vehicle v : arr){
                v.accelerate();

            }
        //Q5: Say I want to do some dynamic method-calling. I.e. I wany my bikes to ring,
        //and my cars to honk, maybe I even want my Hondas to drift. How do I do it in ONE loop?

            //We can use instanceof to find the cars, the hondas and the bikes.
            //We can then use typecasting to create an object with the correct static class, and
            //call specific methods. (Notice that I don't use elseifs, why is that?)
            System.out.println("\nIn this loop, my vehicles go crazy \n");
            for (int i = 0; i < arr.size(); i++){
                if (arr.get(i) instanceof Car){
                    Car car = (Car) arr.get(i);
                    car.honk();
                }
                if (arr.get(i) instanceof Honda){
                    Honda honda = (Honda) arr.get(i);
                    honda.drift();
                }
                if (arr.get(i) instanceof Bicycle){
                    Bicycle bike = (Bicycle) arr.get(i);
                    bike.ring();
                }
            }

    }
    
}
