import July20.Whale;
import July20.Swimmer;

public class TestSwimmer {
	public static void main(String[] args) {
		Swimmer beluga;
		beluga = new Whale();
		beluga.swim();
		beluga.dive();
		
		System.out.println("There are " + Swimmer.NUMBER_OF_FEET_IN_A_LEAGUES + " in a league.");
		
		int feetTraveled = 80_000;
		System.out.println("If the whales went " + feetTraveled + " feet, they would have gone "
				+ Swimmer.convertFromFeetToLeagues(feetTraveled) + " leagues.");
	}
}
