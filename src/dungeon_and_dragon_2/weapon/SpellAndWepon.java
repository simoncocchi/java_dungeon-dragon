package dungeon_and_dragon_2.weapon;

public class SpellAndWepon {
	

	protected String charactereSpellOrWeaponName;
	protected int charactereSpellOrWeaponDammage;
	
	public SpellAndWepon(String newSpellOrWeaponName, int newSpellOrWeaponDammage) {

		this.charactereSpellOrWeaponName = newSpellOrWeaponName;
		this.charactereSpellOrWeaponDammage = newSpellOrWeaponDammage;
	}
	
	//getter et setter
	
	// Name
	
	public String getSpellOrWeaponName() {
		return charactereSpellOrWeaponName;
	}
	
	public void setSpellOrWeaponName(String newSpellOrWeaponName) {
		this.charactereSpellOrWeaponName = newSpellOrWeaponName;
	}
	
	// Dammage
	
	public int getSpellOrWeaponDammage() {
		return charactereSpellOrWeaponDammage;
	}
	
	public void setSpellOrWeaponDammage(int newSpellOrWeaponDammage) {
		this.charactereSpellOrWeaponDammage = newSpellOrWeaponDammage;
	}
}
