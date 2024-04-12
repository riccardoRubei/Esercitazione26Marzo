package game.domain;

public abstract class character {

	private String name;
	
	public int lifePoint;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLifePoint() {
		return lifePoint;
	}

	public void setLifePoint(int lifePoint) {
		this.lifePoint = lifePoint;
	}
	
	
	
}
