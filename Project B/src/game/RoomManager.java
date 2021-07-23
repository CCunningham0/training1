package game;

import fixtures.Room;

/*
 * Class which loads rooms into memory
 */
public class RoomManager {
	Room startingRoom;
	public Room[] rooms;
		
	/*
	 * Creates Room objects, links Rooms through exits, and designates
	 * a starting room
	 */
	public void init() {
		rooms = new Room[8];
		
		// Create Room objects
		Room foyer = new Room(
			"The Foyer",
			"A small foyer",
			"The small entryway of a neo-colonial house. A dining room is open to the West.\n"
			+ "To the north is a medium-sized, tiled kitchen. "
			+ "To the east, through a doorway, is a staircase which leads to the second floor.\n"
			+ "To the west is a living room in which a sofa and a few chairs encircle a brick fireplace."
		);

		rooms[0] = foyer;
		this.startingRoom = foyer;

		Room livingRoom = new Room(
				"The Living Room",
				"A cozy living room",
				"The living space for the residents of the home. It is dimly lit and a single book lies "
				+ "on a side table next to the sofa.\n" 
				+ "To the north is the dining room with a large wooden table. " 
				+ "To the east is the foyer."
			);
		
		this.rooms[1] = livingRoom;
		
		Room kitchen = new Room("The Kitchen",
				"A small open kitchen",
				"The kitchen has granite counter tops, a large white refridgerator, and the shelves are stocked"
				+ "full of food,\n"
				+ "as well as assorted kitchen utensils. To the east is a small bathroom with a single high window.\n"
				+ "To the south is the foyer and entrance to the home. "
				+ "To the west is the dining room with a clean dinner table."
			);
		this.rooms[2] = kitchen;
		
		Room secondFloorHallway = new Room("The Second Floor",
				"A narrow hallway on the second floor",
				"The hallway on the second floor which leads to several upstairs rooms.\n"
				+ "A few paintings of various landscapes hang on the eggshell colored walls.\n"
				+ "To the north is a second bathroom with a bathtub and towel rack. "
				+ "To the west down the hall is the master bedroom."
			);
		this.rooms[3] = secondFloorHallway;
		
		Room diningRoom = new Room ("The Dining Room", 
				"A square dining room",
				"The dining room of the household in which a large aged looking dinner table "
				+ "stands taking up most the space\n"
				+ "and under which cushioned wooden chairs sit. To the east is the kitchen. "
				+ "To the south through an arch is the living room."
			);
		this.rooms[4] = diningRoom;
		
		Room bathRoomFloor1 = new Room ("The 1st Floor Bathroom",
				"A small bathroom off of the kitchen",
				"The first floor bathroom who's doorway stands between the edge of the kitchen"
				+ "counter top and the refridgerator.\n"
				+ "Inside is a toilet, a sink, and small stained glass window near the ceiling. "
				+ "To the west is the narrow doorway leading to the kitchen."
			);
		this.rooms[5] = bathRoomFloor1;
		
		Room bathRoomFloor2 = new Room ("The 2nd Floor Bathroom",
				"A second bathroom upstairs",
				"The bathroom on the second floor which, somewhat larger than the one downstairs,"
				+ "holds a bathtub as well as a rack for towels.\n"
				+ "Shades mask a window looking out over the lawn. "
				+ "To the south is the exit onto the second floor hallway."
			);
		this.rooms[6] = bathRoomFloor2;
		
		Room bedroom = new Room("The Master Bedroom", 
				"A larger master bedroom",
				"The masterbedroom and where the building's owners sleep. Heavy curtains frame the windows\n"
				+ "and a television hangs on the wall across from the bed, above an antique looking dresser.\n"
				+ "To the east is the doorway to the hallway."
			);
		this.rooms[7] = bedroom;
		
		// Set Room exits
		foyer.setExits(kitchen, secondFloorHallway, null, livingRoom);
		livingRoom.setExits(diningRoom, foyer, null, null);
		kitchen.setExits(null, bathRoomFloor1, foyer, diningRoom);
		secondFloorHallway.setExits(bathRoomFloor2, null, foyer, bedroom);
		diningRoom.setExits(null, kitchen, livingRoom, null);
		bathRoomFloor1.setExits(null, null, null, kitchen);
		bathRoomFloor2.setExits(null,null, secondFloorHallway, null);
		bedroom.setExits(null, secondFloorHallway, null, null);		
	}
}
