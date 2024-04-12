package game.domain;

public class warrior extends character{

	int attacco = 10;
	
	public warrior(String nome, int life) {
		super.setName(nome);
		super.setLifePoint(life);
	}
	
	public void attaccoFisico(character c) {
		int puntiVitaNemico = c.getLifePoint();
		c.setLifePoint(puntiVitaNemico-this.attacco);
	}
	
}
