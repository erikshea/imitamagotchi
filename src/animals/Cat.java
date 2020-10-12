package animals;

public class Cat extends Animal {

	public void reset(){
		this.type = "cat";
		this.naturalEnemyType = "dog";
		this.lifeExpectancy = 20;
		this.maxSize = 30;
		this.baseMaxEnergy = 70;
		this.baseMaxHealth = 50;
		super.reset();
	}
	
	
	
	
	public void meow()
	{
		System.out.println("meo");
	}
	
}
