
/**
 * Class used to represent a car factory; returns a car object
 * determind by the passed car type
 *
 * @author Josh Brown
 */
public class CarFactory {

	public static Car getCar(String carType) {

		Car newCar;

		switch (carType) {

		case "Sports":
			newCar = new SportsCar();
			break;

		case "Luxury":
			newCar = new LuxuryCar();
			break;

		default:
			newCar = null;
			break;

		}

		return newCar;

	}

}
