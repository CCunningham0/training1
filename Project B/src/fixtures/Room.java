package fixtures;

import game.RoomManager;

public class Room extends Fixture {
	/*
	 * 4 directions 
	 */
	Room[] exits;
	
	public String name;
	public String shortDesc;
	public String longDesc;
	
	public Room(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		this.name = name;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
		this.exits = new Room[4];
	}
	
	/*
	 * Sets the exits property of the caller object to the passed in room objects
	 * or null if no exit exists in that direction
	 */
	public void setExits(Room north, Room east, Room south, Room west) {
		this.exits[0] = north;
		this.exits[1] = east;
		this.exits[2] = south;
		this.exits[3] = west;	
	}
	
	/*
	 *  Get the exits of a room
	 */
	public Room[] getExits() {
		return this.exits;
	}
	
	/*
	 * Prints all the exits/non-exits of the room to the console
	 */
	public void printExits() {
		String north;
		String east;
		String south;
		String west;
		
		// Validation check for null value, will print "Not an exit" if null
		if (this.exits[0] != null) {
			north = this.exits[0].shortDesc;
		} else {
			north = "Not an exit";
		}
		
		if (this.exits[1] != null) {
			east = this.exits[1].shortDesc;
		} else {
			east = "Not an exit";
		}
		
		if (this.exits[2] != null) {
			south = this.exits[2].shortDesc;
		} else {
			south = "Not an exit";
		}
		
		if (this.exits[3] != null) {
			west = this.exits[3].shortDesc;
		} else {
			west = "Not an exit";
		}
		
		String result = "Exits: \n" + "   North: " + north + "\n"
				+ "   East: " + east + "\n"
				+ "   South: " + south + "\n"
				+ "   West: " + west + "\n";
						
		System.out.println(result);
	}
	
	/*
	 * Check if direction is an exit
	 * Return room object if yes, null if not
	 */
	public Room getExit(String direction) throws IllegalArgumentException {
		String str = direction.toLowerCase();
		
		// Throws error if a valid direction is not entered
		if (!str.equals("north") && !str.equals("east") && !str.equals("south")
				&& !str.equals("west")) {
			throw new IllegalArgumentException("Not a valid direction.");
		}
		
		switch(str) {
			case "north": 
				return this.exits[0];		
			case "east":
				return this.exits[1];
			case "south":
				return this.exits[2];
			case "west": 
				return this.exits[3];
			default:
				return null;
		}
	}
}
