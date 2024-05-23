package program1;

import program.DefualtAccessModifier;

public class DefaultAccessModifier1 {
	public static void main(String[] args) {
		DefualtAccessModifier d = new DefualtAccessModifier();
		d.message();
	}
}
//complie time error


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