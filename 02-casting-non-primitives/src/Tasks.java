import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.move();
        bike.move();

        if (car instanceof Car) {
            Car car1 = (Car) car;
            car1.honk();
        }

        if (bike instanceof Bike) {
            Bike bike1 = (Bike) bike;
            bike1.ringBell();
        }

        Vehicle[] vehicles = new Vehicle[10];
        for (int i = 0; i < vehicles.length; i++) {
            if (i % 2 == 0) {
                vehicles[i] = new Car();
            } else {
                vehicles[i] = new Bike();
            }
        }

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            if (vehicle instanceof Car) {
                ((Car) vehicle).honk();
            } else if (vehicle instanceof Bike) {
                ((Bike) vehicle).ringBell();
            }
        }
    }
}
