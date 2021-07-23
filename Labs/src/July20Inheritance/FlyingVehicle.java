package July20Inheritance;

public class FlyingVehicle extends Vehicle {
	private short wings;
	private Engine engine;
	
	public FlyingVehicle() {}
	
	public FlyingVehicle(short wings, Engine engine) {
		this.wings = wings;
		this.engine = engine;
	}
	
	public short getWings() {
		return wings;
	}
	public void setWings(short wings) {
		this.wings = wings;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void fly() {
		System.out.println("FlyingVehicle is flying...");
	}
	
	public void refule() {
		System.out.println("FlyingVehicle is refueling...");
	}
	
	public void liftOff() {
		System.out.println("FlyingVehicle is lifting off...");
	}
	
	public void land() {
		System.out.println("FlyingVehicle is landing...");
	}
}
