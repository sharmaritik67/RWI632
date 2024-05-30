package methodOverriding;

class Cycle extends Vehicles{
	void run() {
		System.out.println("cycle is running");
	}
	public static void main(String[] args) {
		Cycle b=new Cycle();
		b.run();
		
	}
}

