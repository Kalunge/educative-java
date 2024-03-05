package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vehicle implements Comparable<Vehicle> {
    Integer makeYear;
    String brand;

    public Vehicle(int makeYear, String brand) {
        super();
        this.makeYear = makeYear;
        this.brand = brand;
    }

    @Override
    public int compareTo(Vehicle vehicle) {
//        return this.makeYear - vehicle.makeYear;

        return this.makeYear.compareTo(vehicle.makeYear); // here we use the compareTo method of the Integer class
//        return  this.brand.compareTo(vehicle.brand);  here we sort by brand
    }


    public static class VehicleDemo {
        public static void main(String[] args) {
            Vehicle v1 = new Vehicle(2022);

            Vehicle v2 = new Vehicle(1994);

            Vehicle v3 = new Vehicle(2027);

            Vehicle v4 = new Vehicle(2000);

            List<Vehicle> vehicles = new ArrayList<>();

            vehicles.add(v1);
            vehicles.add(v2);
            vehicles.add(v3);
            vehicles.add(v4);

            Collections.sort(vehicles);

            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle.makeYear);
            }


        }
    }
}
