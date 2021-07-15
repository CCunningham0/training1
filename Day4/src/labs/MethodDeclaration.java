package labs;

public class MethodDeclaration {
	public static void main(String[] args) {
		//create a class instance
		MethodDeclaration md = new MethodDeclaration();
		
		//call method
		md.talk();
		
		md.print();
		md.print("Second print method");
		md.print("Second", "Third");
		
		//call method parameter
		double d = md.convertIntToDouble(44);
		System.out.println(d);
	
		//call method with multiple parameters
		System.out.println(md.sum(1.0, 2, 3));
	}
	
	//create method
	public void talk() {
		System.out.println("Inside of talk method");
	}
	
	//original method
	public void print() {
		System.out.println("Original print method");
	}
	
	//overload method
	public void print(String str) {
		System.out.println(str);
	}
	
	//second overload method
	public void print(String str, String str2) {
		System.out.println(str + " " + str2);
	}
	
	//overload method error example
	//method name and signature do not differ from previous method
	/*
	public void string(String first, String second) {
		System.out.println(str + " " + str2);
	}
	*/
	
	//method parameters
	public double convertIntToDouble(int num) {
		return (double)num;
	}
	
	//multiple method parameters
	public double sum(double num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
}
