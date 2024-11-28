import transport.*;

public class Main {
    public static void main(String[] args) {

        partOneAndTwo();
        bonus();

    }

    private static void partOneAndTwo() {
        // UpCasting
        // creating instances of Bike and Car classes
        Bike bike = new Bike();
        Car car = new Car();

        // upcasting Bike and Car instances to their parent class
        Vehicle vehicle1 = bike;
        Vehicle vehicle2 = car;

        // move each vehicle and also down casting each to their related classes
        moveVehicleAndMakeASound(vehicle1);
        moveVehicleAndMakeASound(vehicle2);

        // try to make an exception by downcasting a Vehicle object that is actually not an instance of the expected class
        falseDownCasting(vehicle1);
        falseDownCasting(vehicle2);
    }

    private static void moveVehicleAndMakeASound(Vehicle vehicle) {
        vehicle.move();
        //DownCasting
        if (vehicle instanceof Bike){
            Bike bike = (Bike) vehicle;
            bike.ringBell();
        } else {
            Car car = (Car) vehicle;
            car.honk();
        }


    }

    private static void falseDownCasting(Vehicle vehicle) {
        // Exception generating:
        if (vehicle instanceof Bike) {
            try {
                Car car = (Car) vehicle;
            } catch (Exception e) {
                System.out.println("Invalid downcast attempt: " + e.getMessage());
            }
        } else {
            try {
                Bike bike = (Bike) vehicle;
            }
            catch (Exception e) {
                System.out.println("Invalid downcast attempt: " + e.getMessage());
            }
        }
    }

    private static void bonus() {
        Bike bike1 = new Bike();
        Bike bike2 = new Bike();
        Bike bike3 = new Bike();

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        Vehicle[] myVehicles = {bike1, car1, bike2, car2, bike3, car3, car4};

        for (Vehicle vehicle : myVehicles) {
            vehicle.move();
            if (vehicle instanceof Bike) {
                Bike bike = (Bike) vehicle;
                bike.ringBell();
            } else {
                Car car = (Car) vehicle;
                car.honk();
            }
        }

    }
}