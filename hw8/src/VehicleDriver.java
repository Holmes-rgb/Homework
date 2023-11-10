/*
Luke Holmes
11/2/23
A short program to simulate a fleet of vehicles. Takes in a txt file and tells what the oldest vehicles are.
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class VehicleDriver {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("vehicles.txt"));

        ArrayList<Vehicle> fleet = new ArrayList<>();
        Person owner;
        while (scanner.hasNext()) {
            switch (scanner.nextLine()) {
                case "Taxi":
                    owner = new Person(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
                    fleet.add(new Taxi(owner, scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()),
                            Integer.parseInt(scanner.nextLine()), Boolean.parseBoolean(scanner.nextLine()), new Person(scanner.nextLine(), scanner.nextLine(),
                            scanner.nextLine()), scanner.nextLine()));
                    break;

                case "Automobile":
                    owner = new Person(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
                    fleet.add(new Automobile(owner, scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()),
                            Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()), Boolean.parseBoolean(scanner.nextLine())));
                    break;

                case "Truck":
                    owner = new Person(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
                    fleet.add(new Truck(owner, scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()),
                            Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine())));
                    break;
            }
        }

        int oldest = fleet.get(0).getYear();

        for (Vehicle vehicle : fleet) {
            int year = vehicle.getYear();
            if (year < oldest) {
                oldest = year;
            }
        }

        ArrayList<Vehicle> sell = new ArrayList<>();
        for (Vehicle vehicle : fleet){
            if (vehicle.getYear() == oldest){
                sell.add(vehicle);
            }
        }

        System.out.println("Vehicles to be sold:");
        for (int i = 0; i < sell.size(); i++){
            System.out.printf("%s:  %d: %s\n\n", (sell.get(i).getClass().toString().toUpperCase()).substring(6), i+1, sell.get(i));
        }
    }
}
