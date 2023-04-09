

public class PassengerCar extends Car{
    int additionalSeats;


    public PassengerCar(){
        maxSpeed = 150;
        numberOfSeats = 5;
        weight = 2;
        tankCapacity = 60;
        color = "black";
        brand = null;
        stateNumber = null;
    }

    public PassengerCar(int maxSpeed, int numberOfSeats, double weight, double tankCapacity, String color, String brand, String stateNumber) {
        super(maxSpeed, numberOfSeats, weight, tankCapacity, color, brand, stateNumber);
    }




}
