package dungeon_and_dragon_2.charactère;

import dungeon_and_dragon_2.weapon.Spell;
import dungeon_and_dragon_2.weapon.Weapon;

public class Wizzard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private String mageName;
	//private String mageImage; // future url de l'image
	private int mageLife;
	private String magePhilterName;
	private Spell spellMage;
	
	public Wizzard(String mageNameParams, int mageLifeParams, String magePhilterNameParams) {
		// Création du guerrier avec des paramettre dans un seul constructeur mais il est possible dans créer plusieur;
		
		this.mageName = mageNameParams;
		this.mageLife = mageLifeParams;
		this.magePhilterName = magePhilterNameParams;
		
	}
	// mise en place setter et getter
	
	//mageName
	public String getNameWizzard() {
	    return mageName;
	  }
	
	public void setNameWizzard(String newName) {
	    this.mageName = newName;
	  }
	//mageLife
	public int getWizzardLife() {
		return mageLife;
	}
	
	public void setWizzardLife(int newWizzardLife) {
		this.mageLife = newWizzardLife;
	}
	
	//philiterName
	
	public String getPhilterName() {
		return magePhilterName;
	}
	
	public void setPhilterName(String newPhilterName) {
		this.magePhilterName = newPhilterName;
	}
	
	// setter de Spell objet
//	public void setSpellObject(Spell newSpellObject) {
//		this.spellMage = newSpellObject;
//	}
	
	public void setObjectSpell(String newName,int newDammage) {
		this.spellMage = new Spell(newName, newDammage);
	}
	
	// spell name
	public String getSpellName() {
		return spellMage.getSpellName();
	}
	
	public void setSpellName(String newSpellName) {
		this.spellMage.setSpellName(newSpellName);
	}
	// spell dammage
	public int getSpellDammage() {
		return spellMage.getSpellDammage();
	}
	
	public void setSpellDammage(int newSpellName) {
		this.spellMage.setSpellDammage(newSpellName);
	}
	
	
	
}
