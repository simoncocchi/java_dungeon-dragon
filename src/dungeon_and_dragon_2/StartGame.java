package dungeon_and_dragon_2;

import java.util.Scanner;

import dungeon_and_dragon_2.charactere.Warrior;
import dungeon_and_dragon_2.charactere.Wizzard;
import dungeon_and_dragon_2.weapon.Spell;
import dungeon_and_dragon_2.weapon.Weapon;

public class StartGame {
	
	public StartGame() {
		Scanner sc = new Scanner(System.in);
		int exit = 0;
		
		while (exit == 0) { //création de l'exit
		
			System.out.println("Voulez vous créer un guerrier ou un mage ? "); 
			String classChoice = sc.nextLine(); // demande de choix de classe et récupération du choix utilisateur 
		
			while (!classChoice.equals("guerrier") && !classChoice.equals("mage")) { // vérification si le choix est valide. 
				System.out.println("Il est seulement possible de choisir guerrier ou mage");
				classChoice = sc.nextLine();
			}
		
			// Selon choix assignation vers une classe différentes 
		
			if (classChoice.equals("guerrier")) {
				
				
				// Question pour mise en place du warrior
				
				System.out.println("Quel sera le nom de votre guerrier ?");
				String warriorName = sc.nextLine();
				
				System.out.println("Quel sera l'arme de votre guerrier ?");
				String weaponName = sc.nextLine();
				
				System.out.println("Quel seront les dégat de votre " + weaponName + " ? (entre 5 et 10)");
				int weaponDammage = sc.nextInt();
				sc.nextLine();
				while (weaponDammage < 5 || weaponDammage > 10) {
					System.out.println("Les dégat de " + weaponName + " doivent être entre 5 et 10)");
					weaponDammage = sc.nextInt();
					sc.nextLine();
				}
				
				System.out.println("Quel sera le nom de votre bouclier ?");
				String shielName = sc.nextLine();
				
				System.out.println("Quel sera les PV de " + warriorName + " ? (entre 5 et 10)");
				int lifeCharactère = sc.nextInt();
				sc.nextLine();
				while (lifeCharactère < 5 || lifeCharactère > 10) {
					System.out.println("Les PV de " + warriorName + " doivent être entre 5 et 10)");
					lifeCharactère = sc.nextInt();
					sc.nextLine();
				}
				
				Warrior guerrierTest = new Warrior(warriorName, lifeCharactère, shielName, weaponName, weaponDammage); // création d'une instance de class guerrier
				
				
				System.out.println("Voulez-vous voir et modifier les donnée de votre personnage ? (y/n)");
				String infoCharactere = sc.nextLine();
				if (infoCharactere.equals("y")) {
					// recupération et modification des données de l'objet
					
					// Affichache et modification name
					
					System.out.println("Le nom du guerrier est \"" + guerrierTest.getNameCharactere() + "\". Voulez modifier ce nom ? (y/n)");
					String changeName = sc.nextLine();
					if (changeName.equals("y")) {
						System.out.println("Quel sera le nouveau nom ?");
						String newWariorName = sc.nextLine();
						guerrierTest.setNameCharactere(newWariorName);
						System.out.println("Le nom a bien été modifier, le guerrier s'appelle maintenant \"" + guerrierTest.getNameCharactere() +"\"");
					}
					
					// Affichache et modification nom arme
					
					System.out.println("Le nom de l'arme est \"" + guerrierTest.getWarriorWeaponName() + "\". Voulez modifier ce nom ? (y/n)");
					String changeNameWeapon = sc.nextLine();
					if (changeNameWeapon.equals("y")) {
						System.out.println("Quel sera le nouveau nom ?");
						String newWariorWeaponName = sc.nextLine();
						guerrierTest.setWarriorWeaponName(newWariorWeaponName);
						System.out.println("Le nom a bien été modifier, l'arme s'appelle maintenant \"" + guerrierTest.getWarriorWeaponName() +"\"");
					}
					
					// Affichache et modification Degat arme
					
					System.out.println("Le nombre de degat actuel est \"" + guerrierTest.getWarriorWeaponDammage() + "\". Voulez modifier le nombre de degat ? (y/n)");
					String changeWeaponDammage = sc.nextLine();
					if (changeWeaponDammage.equals("y")) {
						System.out.println("Quel sera le nouveau nombre de dégat ? (entre 5 et 10)");
						int newWarriorDammage = sc.nextInt();
						sc.nextLine();
						while (newWarriorDammage < 5 || newWarriorDammage > 10) {
							System.out.println("Les dégats doivent être entre 5 et 10)");
							newWarriorDammage = sc.nextInt();
							sc.nextLine();
						}
						
						guerrierTest.setWarriorWeaponDammage(newWarriorDammage);
						System.out.println("Les degat ont bien été modifié, il sont maintent de \"" + guerrierTest.getWarriorWeaponDammage() +"\"");
					}
					
					// Affichache et modification shieldname
					
					System.out.println("Le nom du bouclier est \"" + guerrierTest.getNameShield() + "\". Voulez modifier ce nom ? (y/n)");
					String changeShieldName = sc.nextLine();
					if (changeShieldName.equals("y")) {
						System.out.println("Quel sera le nouveau nom du bouclier ?");
						String newWariorShieldName = sc.nextLine();
						guerrierTest.setNameShield(newWariorShieldName);
						System.out.println("Le nom a bien été modifier, le bouclier s'appelle maintenant \"" + guerrierTest.getNameShield() +"\"");
					}
					
					// Affichache et modification PV
					
					System.out.println("Le nombre de PV actuel est \"" + guerrierTest.getCharactereLife() + "\". Voulez modifier le nombre de PV ? (y/n)");
					String changeWarriorPVChoice = sc.nextLine();
					if (changeWarriorPVChoice.equals("y")) {
						System.out.println("Quel sera le nouveau nombre de PV ? (entre 5 et 10)");
						int newWariorPV = sc.nextInt();
						sc.nextLine();
						while (newWariorPV < 5 || newWariorPV > 10) {
							System.out.println("Les PV doivent être entre 5 et 10)");
							newWariorPV = sc.nextInt();
							sc.nextLine();
						}
						
						guerrierTest.setCharactereLife(newWariorPV);
						System.out.println("Les pV ont bien été modifié, il sont maintent de \"" + guerrierTest.getCharactereLife() +"\"");
					}
				}
				System.out.println("Voulez-vous enregister votre guerrier ? (y/n)");
				String saveAnswer = sc.nextLine();
				Object[] monTableauxGuerrier = new Object[10];	
				int tableauNumnber = 0;
				if(saveAnswer.equals("y")) {
					monTableauxGuerrier[tableauNumnber] = guerrierTest;
					System.out.println(monTableauxGuerrier[tableauNumnber].toString());
					tableauNumnber++;
				}
				

			
			} else if (classChoice.equals("mage")) {
				
				// Question pour mise en place du mage
				
				System.out.println("Quel sera le nom de votre mage ?");
				String mageName = sc.nextLine();
				
				System.out.println("Quel le nom du spell de votre mage");
				String spellName = sc.nextLine();
				
				System.out.println("Quel seront les dégat de votre spell " + spellName + " ? (entre 8 et 15)");
				int spellDammage = sc.nextInt();
				sc.nextLine();
				while (spellDammage < 8 || spellDammage > 15) {
					System.out.println("Les dégat de " + spellName + " doivent être entre 8 et 15)");
					spellDammage = sc.nextInt();
					sc.nextLine();
				}
				
				System.out.println("Quel sera le nom de votre philtre ?");
				String philterName = sc.nextLine();
				
				System.out.println("Quel sera les PV de " + mageName + " ? (entre 3 et 6)");
				int lifeCharactere = sc.nextInt();
				sc.nextLine();
				while (lifeCharactere < 3 || lifeCharactere > 6) {
					System.out.println("Les PV de " + mageName + " doivent être entre 3 et 6)");
					lifeCharactere = sc.nextInt();
					sc.nextLine();
				}
				
				Wizzard mageTest = new Wizzard(mageName, lifeCharactere, philterName); // création d'une instance de class guerrier
				// création de l'arme avec pour paramettre le nom et les dégats venant des paramettres 
				mageTest.setObjectSpell(spellName, spellDammage);
				
				System.out.println("Voulez-vous voir et modifier les donnée de votre personnage ? (y/n)");
				String infoCharactere = sc.nextLine();
				if (infoCharactere.equals("y")) {
					// recupération et modification des données de l'objet
					
					// Affichache et modification name
					
					System.out.println("Le nom du mage est \"" + mageTest.getNameCharactere() + "\". Voulez modifier ce nom ? (y/n)");
					String changeName = sc.nextLine();
					if (changeName.equals("y")) {
						System.out.println("Quel sera le nouveau nom ?");
						String newMageName = sc.nextLine();
						mageTest.setNameCharactere(newMageName);
						System.out.println("Le nom a bien été modifier, le mage s'appelle maintenant \"" + mageTest.getNameCharactere() +"\"");
					}
					
					// Affichache et modification nom spell
					
					System.out.println("Le nom du spell est \"" + mageTest.getSpellName() + "\". Voulez modifier ce nom ? (y/n)");
					String changeNameSpell = sc.nextLine();
					if (changeNameSpell.equals("y")) {
						System.out.println("Quel sera le nouveau nom ?");
						String newMageSpellName = sc.nextLine();
						mageTest.setSpellName(newMageSpellName);
						System.out.println("Le nom a bien été modifier, le spell s'appelle maintenant \"" + mageTest.getSpellName() +"\"");
					}
					
					// Affichache et modification Degat spell
					
					System.out.println("Le nombre de degat actuel est \"" + mageTest.getSpellDammage() + "\". Voulez modifier le nombre de degat ? (y/n)");
					String changeSpellDammage = sc.nextLine();
					if (changeSpellDammage.equals("y")) {
						System.out.println("Quel sera le nouveau nombre de dégat ? (entre 8 et 15)");
						int newSpellDammage = sc.nextInt();
						sc.nextLine();
						while (newSpellDammage < 8 || newSpellDammage > 15) {
							System.out.println("Les dégats doivent être entre 8 et 15)");
							newSpellDammage = sc.nextInt();
							sc.nextLine();
						}
						
						mageTest.setSpellDammage(newSpellDammage);;
						System.out.println("Les degat ont bien été modifié, il sont maintent de \"" + mageTest.getSpellDammage() +"\"");
					}
					
					// Affichache et modification philtre
					
					System.out.println("Le nom du philtre est \"" + mageTest.getPhilterName() + "\". Voulez modifier ce nom ? (y/n)");
					String changePhilterdName = sc.nextLine();
					if (changePhilterdName.equals("y")) {
						System.out.println("Quel sera le nouveau nom du philtre ?");
						String newMagePhilterdName = sc.nextLine();
						mageTest.setPhilterName(newMagePhilterdName);
						System.out.println("Le nom a bien été modifier, le philtre s'appelle maintenant \"" + mageTest.getPhilterName() +"\"");
					}
					
					// Affichache et modification PV
					
					System.out.println("Le nombre de PV actuel est \"" + mageTest.getCharactereLife() + "\". Voulez modifier le nombre de PV ? (y/n)");
					String changeMagePVChoice = sc.nextLine();
					if (changeMagePVChoice.equals("y")) {
						System.out.println("Quel sera le nouveau nombre de PV ? (entre 3 et 6)");
						int newMagePV = sc.nextInt();
						sc.nextLine();
						while (newMagePV < 3 || newMagePV > 6) {
							System.out.println("Les PV doivent être entre 3 et 6)");
							newMagePV = sc.nextInt();
							sc.nextLine();
						}
						
						mageTest.setCharactereLife(newMagePV);
						System.out.println("Les pV ont bien été modifié, il sont maintent de \"" + mageTest.getCharactereLife() +"\"");
					}
				}
				System.out.println("Voulez-vous enregister votre mage ? (y/n)");
				String saveAnswer = sc.nextLine();
				Object[] monTableauxMage = new Object[10];	
				int tableauNumnber = 0;
				if(saveAnswer.equals("y")) {
					monTableauxMage[tableauNumnber] = mageTest;
					System.out.println(monTableauxMage[tableauNumnber]);
					tableauNumnber++;
				}
				
			} // fin else if 
		
			System.out.println("Voulez-vous continuer la crétion de personnage ? (y/n)");
			String createloop = sc.nextLine();
			while (!createloop.equals("y") && !createloop.equals("n")) {
				System.out.println("Il est seulement possible de repondre 'y' ou 'n'");
				createloop = sc.nextLine();
	
			}
			if(createloop.equals("n")) {
				exit = 1;
			}
		
		//demande si veux arreter la création 
		}
		
		System.out.println("fin de la création de personnage");
	}

}
