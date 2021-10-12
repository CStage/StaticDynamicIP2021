import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Q1: Is below statement legal? Why/Why not?
        //Car someCar = new Car();








        //Q2: Pick the legal statements
            //Honda h = new Honda("Civic", 1337);
            //Car c = new Tesla("S3", 1336, "some song");
            //Drivable v1 = new Bicycle("Mosquito", 10);

            //Drivable v2 = h;
            //Drivable v3 = c;
            //Bicycle b1 = v1;
        











            
        //Q3: Say I have the objects below and I want them in one
        //collection, how do I do it?
            Honda H = new Honda("Civic", 521462185);
            Tesla T = new Tesla("Model 3", 112233445, "Star Spangled Banner");
            Bicycle B = new Bicycle("Mosquito", 11245);
            ArrayList<Drivable> arrL = new ArrayList<>();
            arrL.add(H); arrL.add(T); arrL.add(B);

            









        //Q4: Say I want all my Drivables to accelerate(). How do I do it?
        









        //Q5: Say I want to do some dynamic method-calling.
        //I.e. I wany my bikes to ring, and my cars to honk,
        //maybe I even want my Hondas to drift.
        //How do I do it in ONE loop?
        for (Drivable drivable : arrL){
            if (drivable instanceof Car){
                Car c = (Car) drivable;
                c.honk();
            }
            if (drivable instanceof Honda){
                Honda h = (Honda) drivable;
                h.drift();
            }
            if (drivable instanceof Bicycle){
                Bicycle b = (Bicycle) drivable;
                b.ring();
            }
        }
        
            

    }
}
