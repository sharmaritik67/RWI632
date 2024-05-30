package SingleInheritense;

public class Animal3 {

	void eat() {
		System.out.println("eating...");
	}
}

class Elephent extends Animal3 {
	void bark() {
		System.out.println("barking...");
	}
}

class Cow extends Animal3 {
	void meow() {
		System.out.println("meowing...");
	}
}

class TestInheritance3 {
	public static void main(String args[]) {
		Cow c = new Cow();
		c.meow();
		c.eat();

	}
}