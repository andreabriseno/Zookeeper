package animals;

public class Gorilla extends Mammals{
	
	public Gorilla() {}
	
	public void throwThings() {
		this.addEnergy(-5);
		System.out.println("The gorilla is throwing things");
		
		
	}
	
	public void eatBananas() {
		this.addEnergy(10);
		System.out.println("The Gorilla eats some bananas");
	}
	
	public void climb() {
		this.addEnergy(-5);
		System.out.println("Gorilla is climbing");
		
	}
	
	
	
	

}
