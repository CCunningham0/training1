package game;

import fixtures.Room;

/*
 * Class for the current player location (room)
 */
public class Player {
	Room currentRoom;
	
	public void movePlayer(String action, String target) {
		// Check if room exit in given direction exists (is not null)
		try {
			String check = this.currentRoom.getExit(target).name;
		} catch (NullPointerException e) {
			System.out.println("Sorry, there is no exit in that direction.");
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		// Print move message and move player to selected room
		switch(target) {
			case "north":	
				System.out.println("Moved north to " + this.currentRoom.getExit(target).name);
				this.currentRoom = this.currentRoom.getExit(target);
				break;
			case "east":
				System.out.println("Moved east to " + this.currentRoom.getExit(target).name);
				this.currentRoom = this.currentRoom.getExit(target);
				break;
			case "south":
				System.out.println("Moved south to " + this.currentRoom.getExit(target).name);
				this.currentRoom = this.currentRoom.getExit(target);
				break;
			case "west":
				System.out.println("Moved west to " + this.currentRoom.getExit(target).name);
				this.currentRoom = this.currentRoom.getExit(target);
				break;
		}
	}
}
