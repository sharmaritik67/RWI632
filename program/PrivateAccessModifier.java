package program;

public class PrivateAccessModifier {
	private int data = 40;

	private void message() {
		System.out.println("Hello Java");
	}

}

class simple {
	public static void main(String[] args) {
		simple s = new simple();
		System.out.println(s.data);// compile time error
		s.message();// compile time error

	}

}

// In this example, we have created two classes . PrivateAccessModifier class contains
// private data member and private method. We are accessing these private
// members from outside the class, so there is a compile-time error.
