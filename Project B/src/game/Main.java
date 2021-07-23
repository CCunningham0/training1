package game;

import java.util.Scanner;

import fixtures.Room;

public class Main {
	private static Boolean playerQuit = false;
	static RoomManager myRoom =  new RoomManager();
	static Player player = new Player();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Call RoomManager init() method to create room objects
		myRoom.init();
		
		// Initial starting game instructions and starting room information
		System.out.println("Welcome. You have begun the game in the foyer of the household.");
		System.out.println("You may quit the game at any time by entering 'quit' into the console.");
		System.out.println("To move around the house, enter 'go' and a direction. For example: "
				+ "'go north'.\n");
		System.out.println("You are currently in " + myRoom.startingRoom.name + ". "
				+ "Its information is displayed below:");
		
		//System.out.println(myRoom.startingRoom.name);
		player.currentRoom = myRoom.startingRoom;
		printRoom(player);
		player.currentRoom.printExits();
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
		if (!action.equals("go")) {
			System.out.println("Invalid command.");
			return;
		}
		
		if (action.equals("go")) {
			if (!target.equals("north") && !target.equals("east") && !target.equals("south")
					&& !target.equals("west")) {
				System.out.println("Invalid direction.");
				return;
			} else {
				Room tempRoom = player.currentRoom;
				player.movePlayer(action, target);
				Room newRoom = player.currentRoom;
				
				// Print new room information and request new input if player moved successfully
				if (tempRoom != newRoom) {
					System.out.println("\nYou are currently in " + player.currentRoom.name + ". "
							+ "Its information is displayed below:");
					printRoom(player);
					player.currentRoom.printExits();
					System.out.println("What would you like to do next?");
				}
			}
		}

		/*
		 *  //Placeholder code for interactable object additions
		 *	if (action.equals("use")) {
		 *		// FIXME: check if command[1] does not equal any valid fixture name
		 *		System.out.println("Invalid object.");
		 *			return;
		 *	}
		 *					
		 *	if (action.equals("use")) {
		 *		useObject();
		 *	}
		 */
	}
}
