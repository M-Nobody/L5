package bulb;

public class Bulb {
	private boolean state;

	public void turnOff() {
		if (!state)
			System.out.println("Bulb already turned off.");
		else {
			state = true;
			System.out.println("You turned off the bulb.");
		}
	}

	public void turnOn() {
		if (state)
			System.out.println("Bulb already turned on.");
		else {
			state = false;
			System.out.println("You turned on the bulb.");
		}
	}

}
