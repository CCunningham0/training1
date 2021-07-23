package fixtures;

public class Item extends Fixture{
	public String name;
	public String shortDesc;
	public String longDesc;
	
	/*
	 * Sets the Item properties and exits array length
	 * **Not yet implemented into larger project
	 */
	public Item(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		this.name = name;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
	}
}