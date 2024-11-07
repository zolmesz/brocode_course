package oop_dinamic_polymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Animal animal;

		System.out.println("What animal do you want: ");
		System.out.print("1 - Dog, 2 - Cat ");
		int choice = sc.nextInt();

		if (choice == 1) {
			System.out.println();
			animal = new Dog();
			animal.speak();
		} else if (choice == 2) {
			System.out.println();
			animal = new Cat();
			animal.speak();
		} else {
			System.out.println();
			animal = new Animal();
			System.out.println("Invalid choice!");
			animal.speak();
		}

		sc.close();

	}

}
