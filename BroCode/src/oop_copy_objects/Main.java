package oop_copy_objects;

public class Main {

	public static void main(String[] args) {
		
		Car camaro = new Car("Chevrolet", "Camaro", 2020);
		Car mustang = new Car("Ford", "Mustang", 2021);
		Car tesla = new Car("Tesla", "Model3", 2023);
		
		System.out.println(camaro);
		System.out.println(mustang);
		
		// Copy object data from other object
		mustang.copy(camaro);
		
		// Making new object from other object
		Car other = new Car(tesla);
		
		System.out.println(other);
		
		System.out.println();
		System.out.println(camaro.getMake());
		System.out.println(camaro.getModel());
		System.out.println(camaro.getYear());
		System.out.println();
		System.out.println(mustang.getMake());
		System.out.println(mustang.getModel());
		System.out.println(mustang.getYear());
		System.out.println();
		System.out.println(other.getMake());
		System.out.println(other.getModel());
		System.out.println(other.getYear());
		System.out.println();

	}

}
