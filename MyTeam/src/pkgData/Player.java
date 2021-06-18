package pkgData;

public class Player {
	private int numberPlayer;
	private String namePlayer, position;
	public Player(int numberPlayer, String namePlayer, String position) {
		super();
		this.numberPlayer = numberPlayer;
		this.namePlayer = namePlayer;
		this.position = position;
	}
	public int getNumberPlayer() {
		return numberPlayer;
	}
	public void setNumberPlayer(int numberPlayer) {
		this.numberPlayer = numberPlayer;
	}
	public String getNamePlayer() {
		return namePlayer;
	}
	public void setNamePlayer(String namePlayer) {
		this.namePlayer = namePlayer;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "Player numberPlayer=" + numberPlayer + ", namePlayer=" + namePlayer + ", position=" + position + "]";
	}
	
	
	

}
