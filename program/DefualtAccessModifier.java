package program;

public class DefualtAccessModifier {

	void message() {
		System.out.println("hello");
	}
}


//compile time error
//
//If you don't
//use any modifier,
//it is
//treated as default by default.The default
//modifier is
//accessible only within package.
//It cannot
//be accessed
//from outside the package.
//It provides
//more accessibility than private.But,
//it is
//more restrictive than protected,and public
//.