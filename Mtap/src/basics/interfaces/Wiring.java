package basics.interfaces;

public class Wiring {
	public static void main(String[] args) {
		ISwitchBoard switchBoard = new HavellsAppliances();
				//new GEAppliances();
		
		switchBoard.switchOne();
		switchBoard.switchTwo();
		switchBoard.switchThree();
		switchBoard.switchFour();

	}

}
