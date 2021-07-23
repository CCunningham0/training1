package game;

import java.util.Scanner;

public class Main {
	private static Boolean playerQuit = false;
	static RoomManager myRoom =  new RoomManager();
	static Player player = new Player();
	//static Room 
	public static void main(String[] args) {
		// FIXME: game loop goes here
		/*
		 * Create loop
		 * 	display prompt
		 * 	collect input
		 * 	parse input
		 */
		
		
		
		
		// Call RoomManager init() method to create room and fixture objects
		myRoom.init();
		
		// Initial starting game instructions and starting room information
		System.out.println("Welcome. You have begun the game in the foyer of the household.");
		System.out.println("You may quit the game at any time by entering 'quit' into the console.");
		System.out.println("To move around the house, enter 'go' and a direction. For example: "
				+ "'go north'.\n"
				+ "You may also interact with objects in the room by entering 'use' and the object's name."
				+ " For example: 'use chair'.\n");
		System.out.println("You are currently in " + myRoom.startingRoom.name + ". "
				+ "Its information is displayed below:");
		
		//System.out.println(myRoom.startingRoom.name);
		player.currentRoom = myRoom.startingRoom;
		printRoom(player);
		System.out.println("What would you like to do?");
		
		// Run game loop while player has not quit (while playerQuit is false)
		while(!playerQuit) {
			parse(collectInput(), player);
			

			
			
		}
		
		
	}
	
	/*
	 * Prints the name and description of the player's current room
	 */
	public static void printRoom(Player player) {
		System.out.println(player.currentRoom.name + "\n");
		System.out.println(player.currentRoom.longDesc);
	}
	
	public static String[] collectInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine().toLowerCase();
		
		// Remove numbers if any
		input = input.replaceAll("[0-9]","");
		
		// Check if user has entered 'quit'
		if (input.equals("quit")) {
			scan.close();
			return null;
		}

		// Split input string into command and fixture or direction
		String[] parsedInput = input.split(" ");
		scan.close();
		return parsedInput;
	}
	
	public static void parse(String[] command, Player player) {
		// Quit game if input equals "quit"
		if (command == null) {
			playerQuit = true;
			System.out.println("Quit Game. Thanks for playing!");
			return;
		}
		
		// Check for split success
		if (command.length != 2) {
			System.out.println("Please enter a two word response.");
			return;
		}
		
		String action = command[0];
		String target = command[1];
		
		// Throw exception if invalid input is found
		if (!action.equals("go") && !action.equals("use")) {
			System.out.println("Invalid command.");
			return;
		}
		
		if (action.equals("go")) {
			if (!target.equals("north") && !target.equals("east") && !target.equals("south")
					&& !target.equals("west")) {
				System.out.println("Invalid direction.");
				return;
			}
		} 
		
		if (action.equals("use")) {
			// FIXME: check if command[1] does not equal any valid fixture name
				System.out.println("Invalid object.");
				return;
		}
				
		if (action.equals("go")) {
			movePlayer(action, target);
		}	
		
		if (action.equals("use")) {
			useObject();
		}
	}
	
	public static void movePlayer(String action, String target) {
		// Check for if room exit in given direction exists (is not null)
		try {
			String check = player.currentRoom.getExit(target).name;
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
				System.out.println("Moved north to " + player.currentRoom.getExit(target).name);
				player.currentRoom = player.currentRoom.getExit(target);
				break;
			case "east":
				System.out.println("Moved east to " + player.currentRoom.getExit(target).name);
				player.currentRoom = player.currentRoom.getExit(target);
				break;
			case "south":
				System.out.println("Moved south to " + player.currentRoom.getExit(target).name);
				player.currentRoom = player.currentRoom.getExit(target);
				break;
			case "west":
				System.out.println("Moved west to " + player.currentRoom.getExit(target).name);
				player.currentRoom = player.currentRoom.getExit(target);
				break;
		}
		
		// Print new room information and request new input
		System.out.println("\nYou are currently in " + player.currentRoom.name + ". "
				+ "Its information is displayed below:");
		printRoom(player);
		System.out.println("What would you like to do next?");
	}
	
	public static void useObject() {
		// FIXME: Add code for using object (return/print object(fixture) info)
	}
}
