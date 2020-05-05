package dungeon_and_dragon_2.charactère;

import dungeon_and_dragon_2.weapon.Weapon;

public class Warrior extends Personnage {
	
	
	
	private String warriorName;
	//private String warriorImage; // future url de l'image
	private int warriorLife;
	private String warriorShieldName;
	private Weapon weaponWarrior;
	
	public Warrior(String warriorNameParams, int warriorLifeParams, String warriorShieldNameParams, String weaponNameParams, int weaponDammageParams) {
		// Création du guerrier avec des paramettre dans un seul constructeur mais il est possible dans créer plusieur;
		
		this.warriorName = warriorNameParams;
		this.warriorLife = warriorLifeParams;
		this.warriorShieldName = warriorShieldNameParams; 
		
		// création d'une instance de weapon
		this.weaponWarrior = new Weapon(weaponNameParams, weaponDammageParams);
	}
	
	
	//faire getter et setter
	
	// Name
	
	public String getNameWarrior() {
	    return warriorName;
	  }
	
	public void setNameWarrior(String newName) {
	    this.warriorName = newName;
	  }
	
	// Life
	
	public int getWarriorLife() {
	    return warriorLife;
	  }
	
	public void setWarriorLife(int newLifePoint) {
	    this.warriorLife = newLifePoint;
	  }
	
	// Shield 
	
	public String getNameShield() {
	    return warriorShieldName;
	  }
	
	public void setNameShield(String newShieldName) {
	    this.warriorShieldName = newShieldName;
	  }
	
	// warriorWeaponName
	
	public String getWarriorWeaponName() {
	    return weaponWarrior.getWeaponName();
	  }
	
	public void setWarriorWeaponName(String newWarriorWeaponName) {
	    this.weaponWarrior.setWeaponName(newWarriorWeaponName);
	  }
	
	// warriorWeapondammage
	
	public int getWarriorWeaponDammage() {
	    return weaponWarrior.getWeaponDammage();
	  }
	
	public void setWarriorWeaponDammage(int newWarriorWeaponDammage) {
	    this.weaponWarrior.setWeaponDammage(newWarriorWeaponDammage);
	  }
	
	public String toString() {
		return "name: " + this.getNameWarrior() + " - PV: " +this.getWarriorLife()+ " - Shild name: " +this.getNameShield()+ " - Weapon name: " +this.getWarriorWeaponName()+" - Weapon dammage: " + this.getWarriorWeaponDammage() + " a bien été enregisté";
	}
	
}
