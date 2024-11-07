package oop_interface;

public class Main {

	public static void main(String[] args) {

		Rabbit tapsi = new Rabbit();
		Lion leo = new Lion();
		Fish nemo = new Fish();

		tapsi.flee();
		System.out.println();

		leo.hunt();
		System.out.println();

		nemo.flee();
		nemo.hunt();
		System.out.println();

	}

}
