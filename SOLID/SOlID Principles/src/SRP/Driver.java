package SRP;

/**
 * Class to Present the Driver Details
 * 
 * @author othman.alothman
 *
 */
public class Driver {

	private long driverId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int numberOfFamily;
	private LicenceType licenseType;
	
	

	public Driver(String firstName, String lastName,LicenceType licenseType) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.licenseType = licenseType;
	}

	public long getDriverId() {
		return driverId;
	}

	public void setDriverId(long driverId) {
		this.driverId = driverId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getNumberOfFamily() {
		return numberOfFamily;
	}

	public void setNumberOfFamily(int numberOfFamily) {
		this.numberOfFamily = numberOfFamily;
	}

	public LicenceType getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(LicenceType licenseType) {
		this.licenseType = licenseType;
	}

}
