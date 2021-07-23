import July20.Person;
import July20.Developer;

public class TestPersonJuly20 {
	public static void main(String[] args) {
		//Person adam = new Person();
		Person adam = new Developer();
		
		adam.setName("Adam");
		System.out.println(adam.getName());
	}
}
