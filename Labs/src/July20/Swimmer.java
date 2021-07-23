package July20;

public interface Swimmer {
	// interface methods are abstract
	// *work around for this: default or static keywords
	
	int NUMBER_OF_FEET_IN_A_LEAGUES = 18_228;
	
	void swim();
	default void dive() {
		System.out.println("Diving");
	}
	
	static int convertFromFeetToLeagues(int feet) {
		return feet/NUMBER_OF_FEET_IN_A_LEAGUES;
	}
}
