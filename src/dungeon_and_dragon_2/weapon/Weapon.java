package dungeon_and_dragon_2.weapon;

public class Weapon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private String weaponName;
	private int weaponDammage;
	
	public Weapon(String weaponNameParms, int weaponDammageParams) {
		
		
		this.weaponName = weaponNameParms; // Assignation du nom de l'arme
		
		this.weaponDammage = weaponDammageParams; // assignation des dégat de l'arme. 
		
		
	}
	
	// faire getter et setter
	
	// weaponName
	
	public String getWeaponName() {
		return weaponName;
	}
	
	public void setWeaponName(String newWeaponName) {
		this.weaponName = newWeaponName;
	}
	
	// weapon Dammage
	
	public int getWeaponDammage() {
		return weaponDammage;
	}
	
	public void setWeaponDammage(int newWeaponDammage) {
		this.weaponDammage = newWeaponDammage;
	}
	
	
}