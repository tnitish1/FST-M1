package Activities;

public class car {
    //Class Member Variables
    String color;
    int make;
    String transmission;
    int tyres;
    int doors;

    //Constructor
    car() {
        tyres = 4;
        doors = 4;
    }

    //Class Methods
    public void displayCharacteristics() {
        System.out.println("Color of the car: " + color);
        System.out.println("Make of the car: " + make);
        System.out.println("Transmission of the car: " + transmission);
        System.out.println("Number of doors on the car: " + doors);
        System.out.println("Number of tyres on the car: " + tyres);
    }

    public void accelerate() {
        System.out.println("car is moving forward.");
    }

    public void brake() {
        System.out.println("car has stopped.");
    }

}
