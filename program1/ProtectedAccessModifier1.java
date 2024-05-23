package program1;

import program.ProtectedAccessModifier;

public class ProtectedAccessModifier1 extends ProtectedAccessModifier{
	public static void main(String[] args) {
		ProtectedAccessModifier1 p=new ProtectedAccessModifier1();
		p.show();
	}

}

//successfully compile 

//protected
//The protected access modifier is accessible within package and outside the package but through inheritance only.
//
//The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.
//
//It provides more accessibility than the default modifer.