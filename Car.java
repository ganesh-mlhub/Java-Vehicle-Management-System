package Abstract_Class_Assignment;
public class Car extends Vehicle {
	public Car(String brand, double speed,
			double fuelCapacity) {
		super(brand, speed, fuelCapacity);}
	@Override
	public double calculateFuelEfficiency() {
		return (fuelCapacity / speed) * 10;
	}
	@Override
	public String makeSound() {
		return "Vroom Vroom";
	}
	@Override
	public String getVehicleType() {
		return "Car";
	}
}
