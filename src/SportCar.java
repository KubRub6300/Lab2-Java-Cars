

public class SportCar extends PassengerCar {


    public SportCar(){
        super();
        maximumGear = 7;
        maxSpeed = 250;
    }

    public SportCar(int maxSpeed, int numberOfSeats, double weight, double tankCapacity, String color, String brand, String stateNumber) {
        super(maxSpeed, numberOfSeats, weight, tankCapacity, color, brand, stateNumber);
    }
}
