package program;

final class FinalClass {
}

class FinalClass1 extends FinalClass {
	void run() {
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[]) {
		FinalClass1 fs = new FinalClass1();
		fs.run();
	}

}
//compile time error

//Final Keyword in java -- The final keyword in java is used to restrict the user. The java final keyword can be used in many context. 
//Final can be:
//variable
//method
//class

//1) Java final variable
//If you make any variable as final, you cannot change the value of final variable(It will be constant).

//2) Java final method
//If you make any method as final, you cannot override it.

//3) Java final class
//If you make any class as final, you cannot extend it.