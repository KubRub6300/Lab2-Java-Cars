

public class Car {
    int maxSpeed, numberOfSeats, maximumGear, gear, speed;
    double weight, tankCapacity;
    String color, brand, stateNumber;
    boolean started;


    public Car() {
        maxSpeed = 100;
        numberOfSeats = 5;
        maximumGear = 5;
        weight = 2;
        tankCapacity = 60;
        color = "black";
        brand = null;
        stateNumber = null;
        started = false;
        gear = 0;
        speed = 0;
    }

    public Car(int maxSpeed, int numberOfSeats, double weight, double tankCapacity, String color, String brand, String stateNumber) {
        this.maxSpeed = maxSpeed;
        this.numberOfSeats = numberOfSeats;
        this.weight = weight;
        this.tankCapacity = tankCapacity;
        this.color = color;
        this.brand = brand;
        this.stateNumber = stateNumber;
        started = false;
        gear = 0;
        speed = 0;
    }


    public boolean Start() {
        started = true;
        return started;
    }

    public boolean Stop() {
        started = false;
        return started;
    }

    public int UpgradeGear() {

        if (gear < maximumGear) gear += 1;
        return gear;
    }

    public int DowngradeGear() {

        if (gear < maximumGear) gear -= 1;
        return gear;
    }

    public int Boost() {

        if (speed < maxSpeed) speed += 1;
        return speed;
    }

    public int Braking() {

        if (speed < maxSpeed) speed -= 1;
        return speed;
    }
}
