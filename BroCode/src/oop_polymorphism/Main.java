package oop_polymorphism;

public class Main {

	public static void main(String[] args) {

		Car car = new Car();
		Bicycle bike = new Bicycle();
		Boat boat = new Boat();

		// car, bike, boat are vehicle too
		Vehicle[] racers = { car, bike, boat };
		
		for (Vehicle x : racers) {
			x.go();
		}		

	}

}
