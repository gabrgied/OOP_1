
public class TestDoor {

	public static void main(String[] args) {

		Door liokajus = new Door();
		Door gyventojas = new Door();
		Door vagis = new Door();
		
		liokajus.knock();
		liokajus.knock();
		gyventojas.knockAllNight();
		liokajus.knock();
		vagis.openTheDoor();
	}

}
