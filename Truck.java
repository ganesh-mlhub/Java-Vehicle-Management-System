package Abstract_Class_Assignment;
public class Truck extends Vehicle{
	public Truck(String brand, double speed,
			double fuelCapacity) {
		super(brand, speed, fuelCapacity);}
	@Override
	public double calculateFuelEfficiency() {
		return (fuelCapacity / speed) * 5;
	}
	@Override
	public String makeSound() {
		return "Horn Blows!";
	}
	@Override
	public String getVehicleType() {
		return "Truck";	
	}
}
