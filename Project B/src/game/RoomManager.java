package game;

import fixtures.Room;

/*
 * Class which loads rooms into memory
 */
public class RoomManager {
	// Instantiates all Room objects, link them together through exits,
	// and designate a starting room
	Room[] rooms;
	Room startingRoom;
	
	Room[][] exits;
	
	public void init() {

		Room foyer = new Room(
			"The Foyer",
			"A small foyer",
			"The small entryway of a neo-colonial house. A dining room is open to the West.\n"
			+ "To the north is a medium-sized, tiled kitchen.\n"
			+ "To the east, through a doorway, is a staircase which leads to the second floor\n."
		);

		this.rooms[0] = foyer;
		//this.rooms[0][1] = rooms[1][0]; // 2 dimensional array to hold both room and exit data
		this.startingRoom = foyer;

				
		Room diningRoom = new Room("", "", ""); // , rooms[0].exits);
		this.rooms[1] = diningRoom;
		
		Room kitchen = new Room("", "", "");
		this.rooms[2] = kitchen;
		
		Room secondFloorHallway = new Room("", "", "");
		this.rooms[3] = secondFloorHallway;
		
		Room bedroom = new Room("", "", "");
		this.rooms[4] = bedroom;
		
		this.exits[0][0] = rooms[2];
		this.exits[0][1] = rooms[3];
		this.exits[0][2] = null;
		this.exits[0][2] = rooms[4];
	}
}

/* 



*/