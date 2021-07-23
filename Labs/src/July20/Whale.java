package July20;

public class Whale extends Mammal implements Swimmer {

	@Override // generates error if method doesn't exist anywhere in hierarchy
	public void swim() {
		System.out.println("Swim swim swim");
	}

}
