package org.dcistudent;

import org.dcistudent.models.gaming.Vehicle;
import org.dcistudent.models.gaming.Bike;
import org.dcistudent.models.gaming.Car;
import org.dcistudent.services.gaming.Chess;
import org.dcistudent.services.gaming.Game;
import org.dcistudent.services.gaming.TicTacToe;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        // Upcasting: Chess object to Game reference
        Game game = new Chess(); // Upcasting
        game.play();

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

        // Upcasting vehicles
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        ((Vehicle) car).move();
        ((Vehicle) bike).move();

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
    }
}