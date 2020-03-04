
/**
 * Abstract class representing simple car object
 *
 * @author Josh Brown
 *
 */
public abstract class Car {

	private String vin;
	private String year;

	/**
	* Method used to represent the car accelerating
	*/
	public void accelerate(double speed) {
		System.out.println("Accelerating");
	}

	/**
	* Method used to represent the car stopping
	*/
	public void stop() {
		System.out.println("Stopping");
	}

	/**
	* Abstract method for building car object
	*/
	public abstract void build();

	/**
	* Abstract method for unique toString()
	*/
	public abstract String toString();

}
