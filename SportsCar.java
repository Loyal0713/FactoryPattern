
/**
 * Class used to represent a sports car
 *
 * @author Josh Brown
 */
public class SportsCar extends Car{

	@Override
	public void build() {
		System.out.println("Building sports car");
	}

	@Override
	public String toString() {
		return "Sports car";
	}

}
