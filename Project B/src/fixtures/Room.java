package fixtures;

public class Room extends Fixture {
	/*
	 * 4 directions 
	 */
	Room[] exits;
	
	public Room(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		this.exits = new Room[4]; // FIXME: 4 directions, boolean based if exit or not?
		
		// set to passed in references to indexes in rooms array??
		//input: {1,2,3,4}
		
		//this.exits =
	}
	
	// Get the exits of a room
	public Room[] getExits() {
		// Should be array of size 4, with references to rooms array indexes or null??
		return this.exits;
	}
	
	// Check if direction is an exit
	public Room getExit(String direction) {
		if (direction == null) {
			return null;
		}
		
		String str = direction.toLowerCase();
		
		switch(str) {
			case "north": 
				return exits[0];		
			case "east":
				return exits[1];
			case "south":
				return exits[2];
			case "west": 
				return exits[3];
			default:
				return null;
		}
	}
}
