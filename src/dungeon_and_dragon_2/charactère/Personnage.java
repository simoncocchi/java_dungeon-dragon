package dungeon_and_dragon_2.charactère;

public class Personnage {
	
	protected String charactereName;
	protected int charactereLife;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Personnage (String newCharactereName, int newCharactereLife) {
		this.charactereName = newCharactereName;
		this.charactereLife = newCharactereLife;
	}
	
	//setter et getter
	
	// Name
	
	public String getNameCharactere() {
	    return charactereName;
	  }
	
	public void setNameCharactere(String newName) {
	    this.charactereName = newName;
	  }
	
	// Life
	
	public int getCharactereLife() {
	    return charactereLife;
	  }
	
	public void setCharactereLife(int newLifePoint) {
	    this.charactereLife = newLifePoint;
	  }
	
}
