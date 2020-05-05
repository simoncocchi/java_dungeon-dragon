package dungeon_and_dragon_2.weapon;

public class Spell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private String spellName;
	private int spellDammage;
	
	public Spell(String spellNameParams,int spellDammageParams) {
		this.spellName = spellNameParams;
		
		this.spellDammage = spellDammageParams;
	}
	//mise en place getter et setter
	
	public String getSpellName() {
		return spellName;
	}
	
	public void setSpellName(String newSpellName) {
		this.spellName = newSpellName;
	}
	
	//
	
	public int getSpellDammage() {
		return spellDammage;
	}
	
	public void setSpellDammage(int newSpellDammage) {
		this.spellDammage =newSpellDammage;
	}
}
