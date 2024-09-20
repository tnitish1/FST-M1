package Activities;

public class Activity1 {
    public static void main(String[] args) {
        car benz = new car();
        benz.make = 2014;
        benz.color = "Black";
        benz.transmission = "Manual";

        //Using Car class method
        benz.displayCharacteristics();
        benz.accelerate();
        benz.brake();
    }

}

