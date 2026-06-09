package Abstract_Class_Assignment;
public abstract class Vehicle {
	String brand;	
	double speed;
	double fuelCapacity;
	public Vehicle(String brand, double speed, 
			double fuelCapacity) {
		super();
		this.brand = brand;
		this.speed = speed;
		this.fuelCapacity = fuelCapacity;} 
	public void displayInfo() {
		System.out.printf("Brand: %-15s | Speed: %.0f km/h%n", 
				brand, speed);}
	public abstract double calculateFuelEfficiency();
	public abstract String makeSound();
	public abstract String getVehicleType();
}
