package July20;

import Test.PersonAccessModifiers;
import Test.ProtectedSubClassAccessModifiers;

public class AccessModifiers {
	public static void main(String[] args) {
		PersonAccessModifiers adam = new PersonAccessModifiers();
		adam.age = 15;
		
		System.out.println(adam.age);
		
		ProtectedSubClassAccessModifiers psc = new ProtectedSubClassAccessModifiers();
		psc.printID();
	}
}
