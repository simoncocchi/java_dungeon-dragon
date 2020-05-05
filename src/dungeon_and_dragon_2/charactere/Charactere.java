package dungeon_and_dragon_2.charactere;

public class Charactere {
	
	protected String charactereName;
	protected int charactereLife;
	
	
	public Charactere (String newCharactereName, int newCharactereLife) {
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
