
public class Bird extends Animal{ 
	public  Bird() {
		System.out.println("Now I am a bird");
	}
	@Override
	public String sleep() {
		return ("A bird sleeps...");
	}
	public String eat() {
		return("A bird eats...");
	}
	public String fly() {
		return ("A bly flys...");
	}
}