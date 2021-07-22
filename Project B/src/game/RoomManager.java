package game;

import fixtures.Room;

/*
 * Class which loads rooms into memory
 */
public class RoomManager {
	// Instantiates all Room objects, link them together through exits,
	// and designate a starting room
	public Room[] rooms;
	Room startingRoom;
	
	/*
	 * Creates Room objects, links them through exits, and designates
	 * a starting room
	 */
	public void init() {
		rooms = new Room[8];
		
		// Create Room objects
		Room foyer = new Room(
			"The Foyer",
			"A small foyer",
			"The small entryway of a neo-colonial house. A dining room is open to the West.\n"
			+ "To the north is a medium-sized, tiled kitchen.\n"
			+ "To the east, through a doorway, is a staircase which leads to the second floor\n."
			+ "To the west is a living room in which a sofa and a few chairs encircle a brick fireplace.\n"
		);

		rooms[0] = foyer;
		this.startingRoom = foyer;

		Room livingRoom = new Room(
				"The Living Room",
				"A cozy living room",
				"The living space for the residents of the home. It is dimly lit and a single book lies "
				+ "on a side table next to the sofa.\n" 
				+ "To the north is the dining room with a large wooden table.\n" 
				+ "To the east is the foyer.\n");
		this.rooms[1] = livingRoom;
		
		Room kitchen = new Room("The Kitchen",
				"A small open kitchen",
				"The kitchen has granite counter tops, a large white refridgerator, and the shelves are stocked"
				+ "full of food, as well as assorted kitchen utensils.\n"
				+ "To the west is the dining room with a clean dinner table.\n"
				+ "To the south is the foyer and entrance to the home.\n"
				+ "To the east is a small bathroom with a single high window.\n");
		this.rooms[2] = kitchen;
		
		Room secondFloorHallway = new Room("NAME PLACEHOLDER", "SHORT DESC PLACEHOLDER", "LONG DESC PLACEHOLDER");
		this.rooms[3] = secondFloorHallway;
		
		Room diningRoom = new Room ("", "", "");
		this.rooms[4] = diningRoom;
		
		Room bathRoomFloor1 = new Room ("", "", "");
		this.rooms[5] = bathRoomFloor1;
		
		Room bathRoomFloor2 = new Room ("", "", "");
		this.rooms[6] = bathRoomFloor2;
		
		Room bedroom = new Room("NAME PLACEHOLDER", "SHORT DESC PLACEHOLDER", "LONG DESC PLACEHOLDER");
		this.rooms[7] = bedroom;
		
		// Set Room exits
		foyer.setExits(kitchen, secondFloorHallway, null, livingRoom);
		livingRoom.setExits(diningRoom, kitchen, null, null);
		kitchen.setExits(null, bathRoomFloor1, foyer, diningRoom);
		secondFloorHallway.setExits(bathRoomFloor2, null, foyer, bedroom);
		diningRoom.setExits(null, kitchen, livingRoom, null);
		bathRoomFloor1.setExits(null, null, null, kitchen);
		bathRoomFloor2.setExits(null,null, secondFloorHallway, null);
		bedroom.setExits(null, secondFloorHallway, null, null);		
	
	}
}
