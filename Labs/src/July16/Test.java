package July16;

public class Test {
	public static void main(String[] args) {
		A.staticCount = 2494;
		System.out.println("Class A staticCount: " + A.staticCount);
		
		A a = new A();
		
		System.out.println(a.instanceCount); // access via instance of class
		System.out.println(A.staticCount); // directly access from the class
	
		A a2 = new A();
		
		System.out.println(a2.instanceCount); // access via instance of class
		System.out.println(A.staticCount); // directly access from the class
		
		a.instanceCount = 15;
		System.out.println("Object a instanceCount: " + a.instanceCount);
		System.out.println("Object a2 instanceCount: " + a2.instanceCount);
		
		System.out.println("Class A staticCount: " + A.staticCount);
	}
}
