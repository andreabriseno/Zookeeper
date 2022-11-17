package animals;

public class Speciman {
private int energy = 300;
	
	public int displayEnergy() {
		System.out.println("Energy level:" + this.energy);
		return this.energy; 
	}
	
	public void addEnergy(int change) {
		this.energy += change;
	}
	

}
