package game;

import fixtures.Item;

/*
 * Class which loads items into memory
 * **Not yet implemented into larger project
 */
public class ItemManager {
	public Item[] items;
	
	/*
	 * Creates Item objects and assigns each to a room?
	 */
	public void init() {
		items = new Item[1];
		
		// Create Item objects
		Item book = new Item(
				"",
				"",
				"");
		items[0] = book;
	}
}