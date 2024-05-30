package SingleInheritense;

class Animal1 {
	void eat() {
		System.out.println("eating...");
	}
}

class Cat extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

class BabyCat extends Cat {
	void weep() {
		System.out.println("weeping...");
	}
}

class TestInheritance2 {
	public static void main(String args[]) {
		BabyCat d = new BabyCat();
		d.weep();
		d.bark();
		d.eat();
	}
}