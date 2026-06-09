package Abstract_Class_Assignment;
import java.util.ArrayList;
public class Main {
	private static void printVehicleDetails(Vehicle v) {
		v.displayInfo();
		System.out.printf("Vehicle Type      : %s%n",   v.getVehicleType());
		System.out.printf("Fuel Efficiency   : %.2f km/l%n", v.calculateFuelEfficiency());
		System.out.printf("Sound             : %s%n",   v.makeSound());
		System.out.println("─".repeat(45));
	}
	public static void main(String[] args) {
		Car   car   = new Car  ("Toyota",       80, 50);
		Bike  bike  = new Bike ("Royal Enfield", 60, 30);
		Truck truck = new Truck("Tata Truck",    40, 30);
		System.out.println("=".repeat(45));
		System.out.println("   VEHICLE MANAGEMENT SYSTEM");
		System.out.println("=".repeat(45));
		car.displayInfo();
		System.out.printf("Fuel Efficiency : %.2f km/l%n", car.calculateFuelEfficiency());
		System.out.printf("Sound           : %s%n%n",       car.makeSound());
		bike.displayInfo();
		System.out.printf("Fuel Efficiency : %.2f km/l%n", bike.calculateFuelEfficiency());
		System.out.printf("Sound           : %s%n%n",       bike.makeSound());
		truck.displayInfo();
		System.out.printf("Fuel Efficiency : %.2f km/l%n", truck.calculateFuelEfficiency());
		System.out.printf("Sound           : %s%n",         truck.makeSound());
		System.out.println("\n" + "=".repeat(45));
		System.out.println("   ALL VEHICLES (ArrayList iteration)");
		System.out.println("=".repeat(45));
		ElectricCar electricCar = new ElectricCar("Tesla Model 3", 120, 75);
		ArrayList<Vehicle> fleet = new ArrayList<>();
		fleet.add(car);
		fleet.add(bike);
		fleet.add(truck);
		fleet.add(electricCar);   
		for (Vehicle v : fleet) {
			printVehicleDetails(v);
		}
	}


}

