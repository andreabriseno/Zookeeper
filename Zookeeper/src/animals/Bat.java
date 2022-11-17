package animals;

public class Bat extends Speciman {
	
	public Bat() {}
	
	public void fly() {
		this.addEnergy(-50);
		System.out.println("Ehhhhhh" );
		
	}
	
	public void eatHumans() {
		this.addEnergy(25);
		System.out.println("Yummy human");
	}
	
	public void attackTown() {
		this.addEnergy(-100);
		System.out.println("Ahhh the town is on fire");
		
	}

}
