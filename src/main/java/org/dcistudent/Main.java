package org.dcistudent;

import org.dcistudent.models.gaming.Vehicle;
import org.dcistudent.models.gaming.Bike;
import org.dcistudent.models.gaming.Car;
import org.dcistudent.services.gaming.Chess;
import org.dcistudent.services.gaming.Game;
import org.dcistudent.services.gaming.TicTacToe;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        // Task 1.1
        System.out.println("--- Task 1.1 ---");
        // Upcasting: Chess object to Game reference
        Game game = new Chess(); // Upcasting
        game.play();

        // Task 1.2
        // Downcasting: Game reference back to Chess object
        if (game instanceof Chess) {
            Chess chess = (Chess) game; // Downcasting
            chess.play();
        }

        Game game2 = new Game();
        try {
            ((TicTacToe) game2).play();
        } catch (ClassCastException e) {
            System.out.println("Invalid downcasting: Cannot cast Game to TicTacToe.");
        }

        // Task 2.1.{1,2,2} & 2.2.1
        System.out.println("--- Task 2.1.{1,2,2} & 2.2.1 ---");
        // Upcasting vehicles
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        try {
            ((Vehicle) car).move();
        } catch (ClassCastException e) {
            System.out.println("Invalid upcasting: Cannot cast Car to Vehicle.");
        }
        try {
            ((Vehicle) bike).move();
        } catch (ClassCastException e) {
            System.out.println("Invalid upcasting: Cannot cast Bike to Vehicle.");
        }

        // Downcasting vehicles
        if (car instanceof Car) {
            Car car2 = (Car) car;
            car2.honk();
        }

        if (bike instanceof Bike) {
            Bike bike2 = (Bike) bike;
            bike2.ringBell();
        }

        Vehicle vehicle = new Car();
        try {
            ((Bike) vehicle).ringBell();
        } catch (ClassCastException e) {
            System.out.println("Invalid downcasting: Cannot cast Vehicle to Bike.");
        }

        // Task 2.3
        System.out.println("--- Task 2.3 ---");
        List<Vehicle> vehicles = List.of(new Vehicle(), new Car(), new Bike(), new Vehicle());
        for (Vehicle v : vehicles) {
            v.move();

            if (v instanceof Car c) {
                c.honk();
            }

            if (v instanceof Bike b) {
                b.ringBell();
            }
        }
    }
}