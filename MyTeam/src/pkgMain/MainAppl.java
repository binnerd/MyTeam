package pkgMain;

import pkgData.Player;

public class MainAppl {

	public static void main(String[] args) {
		Player player = new Player(2, "Dragovic", "Defense");
		System.out.println("== " + player);
		player = new Player(4, "Hinteregger", "Defense");
		System.out.println("== " + player);
		
		player = new Player(10, "Kalajdzic", "Striker");
		System.out.println("== " + player);
		
		player = new Player(8, "Baumgartner", "Midfielder");
		System.out.println("== " + player);
	}

}
