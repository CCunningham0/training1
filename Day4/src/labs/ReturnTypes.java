package labs;

public class ReturnTypes {
	public static void main(String[] args) {
		//create a class instance
		ReturnTypes rt = new ReturnTypes();
	
		//call methods
		rt.returnNothing();
	
		boolean b = rt.returnBoolean();
		System.out.println("The value of b is " + b);
	}
	
	public void returnNothing() {
		System.out.println("Inside of void method");
	}
	
	public boolean returnBoolean() {
		return true;
	}
}
