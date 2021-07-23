package fixtures;

public abstract class Fixture {
	String name;
	String shortDesc;
	String longDesc;
	
	public Fixture(String name2, String shortDesc2, String longDesc2) {
		this.name = name2;
		this.shortDesc = shortDesc2;
		this.longDesc = longDesc2;
	}
}
