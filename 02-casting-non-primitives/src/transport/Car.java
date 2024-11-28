package transport;

public class Car extends Vehicle{
    public Car() {
    }

    public void honk() {
        System.out.println("Car is honking!");
    }

    @Override
    public void move() {
        System.out.println("Car is moving!");
    }
}
