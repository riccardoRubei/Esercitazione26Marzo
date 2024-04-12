package game.domain;

public class mage extends character {

	int attacco = 10;
	
	public mage(String nome, int life) {
		super.setName(nome);
		super.setLifePoint(life);
	}
	
	public void attaccoMagico(character c) {
		int puntiVitaNemico = c.getLifePoint();
		c.setLifePoint(puntiVitaNemico-this.attacco);
	}
	
}
