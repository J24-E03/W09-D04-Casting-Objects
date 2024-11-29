public class Main {
    public static void main(String[] args) {
        //create an object of the "Chess" class and upcast it to the "Game" class.
        Game game = new Chess();
        game.play(); //Call the "play()" method on the upcasted object

        //create an object of the "Game" class and downcast it to the "Chess" class.
        Game game2 = new Chess();
        game2 = (Chess)game2;
        game2.play();
// create instances of Car and Bike and assign them to Vehicle references.
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bike();
        vehicle1.move();
        vehicle2.move();
//downcast the Vehicle references back to Car and Bike respectively to access subclass-specific methods.
        if (vehicle1 instanceof Car) { // Part 2: Down casting with instanceof
            Car car = (Car) vehicle1;
            car.honk();
        }
        if (vehicle2 instanceof Bike) { // Part 2: Down casting with instanceof
            Bike bike = (Bike) vehicle2;
            bike.ringBell();
        }
        Vehicle[] vehiclesArray = new Vehicle[]{
                new Car(),
                new Bike(),
                new Car(),
                new Bike(),
        };
        for(Vehicle i : vehiclesArray){
            i.move(); // // Polymorphic call to move()

            if (i instanceof Car) {
                Car car = (Car) i;
                car.honk();
            } else if (i instanceof Bike) {
                Bike bike = (Bike) i;
                bike.ringBell();
            }
        }
    }
}
