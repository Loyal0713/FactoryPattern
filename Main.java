package inClass10Pkg;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Car> carList;

	public static void main(String args[]) {

		carList = new ArrayList<Car>();

		Scanner kb = new Scanner(System.in);
		String userInput = "";

		//add x amount of cars - enter exit to stop loop
		while (!userInput.equals("exit")) {

			System.out.println("What car to add:");
			userInput = kb.nextLine();

			if (userInput.equals("Luxury") | userInput.equals("Sports")) {

				Car newCar = CarFactory.getCar(userInput);
				carList.add(newCar);

			}
			
		}
		
		//print entire car list
		printCarList();

	}
	
	public static void printCarList() {
		
		for(int i = 0; i < carList.size(); i++) {
			System.out.println(carList.get(i).toString());
		}
		
	}

}
