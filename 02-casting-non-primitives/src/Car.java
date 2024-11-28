public class Car extends Vehicle {
    public void honk() {
        System.out.println("Meep-meep like a jeep...");
    }

    @Override
    public void move() {
        super.move();
        System.out.println(getClass().getSimpleName() + ".move() is called.");
    }
}
