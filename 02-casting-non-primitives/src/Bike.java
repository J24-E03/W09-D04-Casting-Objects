public class Bike extends Vehicle {
    public void ringBell() {
        System.out.println("Ring-ring like a thing...");
    }

    @Override
    public void move() {
        super.move();
        System.out.println(getClass().getSimpleName() + ".move() is called.");
    }
}
