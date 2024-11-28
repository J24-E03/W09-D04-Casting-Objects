package transport;

public class Bike extends Vehicle{

    public Bike() {
    }

    public void ringBell() {
        System.out.println("Bike is ringing its bell!");
    }

    @Override
    public void move() {
        System.out.println("Bike is moving!");
    }
}
