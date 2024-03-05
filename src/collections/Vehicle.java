package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
            Vehicle v1 = new Vehicle(2022, "Nissan");

            Vehicle v2 = new Vehicle(1994, "Lexus");

            Vehicle v3 = new Vehicle(2027, "Prado");

            Vehicle v4 = new Vehicle(2000, "Outback");

            List<Vehicle> vehicles = new ArrayList<>();

            vehicles.add(v1);
            vehicles.add(v2);
            vehicles.add(v3);
            vehicles.add(v4);

            System.out.println("Sorting by Comparable");
            Collections.sort(vehicles);
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle.makeYear);
            }

            System.out.println();

            System.out.println("Sorting by brand name using BrandComparator");
            Collections.sort(vehicles, new BrandComparator());
            for (Vehicle vehicle : vehicles) {
                System.out.println("Vehicle Brand: " + vehicle.brand + ", Vehicle Make: " + vehicle.makeYear);
            }
            System.out.println();

            System.out.println("Sorting by brand year using BrandMakeYear");
            Collections.sort(vehicles, new MakeYearComparator());
            for (Vehicle vehicle : vehicles) {
                System.out.println("Vehicle Brand: " + vehicle.brand + ", Vehicle Make: " + vehicle.makeYear);
            }

            System.out.println();

            Collections.sort(vehicles, new Comparator<Vehicle>() {
                @Override
                public int compare(Vehicle o1, Vehicle o2) {
                    return o1.makeYear.compareTo(o2.makeYear);
                }
            });

            Collections.sort(vehicles, new Comparator<Vehicle>() {
                @Override
                public int compare(Vehicle o1, Vehicle o2) {
                    return o1.brand.compareTo(o2.brand);
                }
            });


        }
    }

    public static class MakeYearComparator implements Comparator<Vehicle> {
        @Override
        public int compare(Vehicle vehicleOne, Vehicle vehicleTwo) {
            return vehicleOne.makeYear.compareTo(vehicleTwo.makeYear);
        }
    }

    public static class BrandComparator implements Comparator<Vehicle> {
        @Override
        public int compare(Vehicle vehicleOne, Vehicle vehicleTwo) {
            return vehicleOne.brand.compareTo(vehicleTwo.brand);
        }
    }
}
