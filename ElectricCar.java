package Abstract_Class_Assignment;
public class ElectricCar extends Vehicle{
	public static final double KWH_PER_LITRE_EQUIVALENT = 8.9;
	public ElectricCar(String brand, double speed,
			double batteryCapacityKWh) 
	{super(brand, speed, batteryCapacityKWh);}
	@Override
	public double calculateFuelEfficiency() {
		return (fuelCapacity * KWH_PER_LITRE_EQUIVALENT) / speed * 10;}
	@Override
	public String makeSound() {
		return "Silent Hum";}
	@Override
	public String getVehicleType() {
		return "Electric Car";}
}
