package animals;

public abstract class Mammals {
	private int energy = 100;
	
	public int displayEnergy() {
		System.out.println("Energy level:" + this.energy);
		return this.energy; 
	}
	
	public void addEnergy(int change) {
		this.energy += change;
	}
}
