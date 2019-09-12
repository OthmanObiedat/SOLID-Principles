package SRP;

public class Vehicle {

	private long vehicleId;
	private Driver driver;
	private VehicleProerties proerties;

	public Vehicle(Driver driver, VehicleProerties proerties) {
		this.driver = driver;
		this.proerties = proerties;
	}

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public VehicleProerties getProerties() {
		return proerties;
	}

	public void setProerties(VehicleProerties proerties) {
		this.proerties = proerties;
	}

}
