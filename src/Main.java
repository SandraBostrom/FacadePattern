import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int choice;
    private static Scanner scan;

    public static void main(String[] args) {


        System.out.println("Would you like to \n1.Order a car \n2.Repair your car");
        choice = scan.nextInt();
        if (choice == 1) {
            orderCar();
        }
    }

    public static void orderCar() {
        System.out.println("What car would you like to order: \n1.Audi \n2.BMW \n3.Volkswagen ");
        choice = scan.nextInt();
        CarMaker carMaker = new CarMaker();


        switch (choice) {
            case 1:
                carMaker.buildAudi();
                break;
            case 2:
                carMaker.buildBMW();
                break;
            case 3:
                carMaker.buildVolkswagen();
                break;

        }
    }

    public static void repairCar() {
        System.out.println("What car would you like to repair: \n1.Audi \n2.BMW \n3.Volkswagen ");
        choice = scan.nextInt();
        CarMaker carMaker = new CarMaker();


        switch (choice) {
            case 1:
                carMaker.repairAudi();
                break;
            case 2:
                carMaker.repairBMW();
                break;
            case 3:
                carMaker.repairVolkswagen();
                break;
        }
    }
}