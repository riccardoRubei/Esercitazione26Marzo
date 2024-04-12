package game;

import java.util.Scanner;

import game.domain.mage;
import game.domain.warrior;

public class fight {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		warrior myWarrior = new warrior("Rick", 50);		
		mage advMage = new mage("Morty", 40);
		
		System.out.println("Quale personaggio vuoi essere:");
		System.out.println("1 warrior");
		System.out.println("2 mage");
		String decision = keyboard.next();
		
//		if(decision=="1") {
//			warrior myWarrior = new warrior("Rick");
//			mage advMage = new mage("Morty");
//		}
//		else {
//			mage myMage = new mage("Rick");
//			warrior advWarrior = new warrior("Morty");
//		}
//		
		
		while(true) {
			
			System.out.println("Giocatore1 - 1 Attacco");
			String innerDecision = keyboard.next();
			if(innerDecision.equals("1")) {
				myWarrior.attaccoFisico(advMage);
				System.out.println("Punti Vita Avversario:"+advMage.getLifePoint());
				}
			System.out.println("Giocatore2 - 1 Attacco");
			innerDecision = keyboard.next();
			if(innerDecision.equals("1")) {
				advMage.attaccoMagico(myWarrior);
				System.out.println("Punti Vita Miei:"+myWarrior.getLifePoint());
				}
			
			
				if(myWarrior.getLifePoint()<0) {
					System.out.println("Hai Perso");
					break;
					}
				if(advMage.getLifePoint()<0) {
					System.out.println("Hai Vinto");
					break;
					}
				}
			}

}
