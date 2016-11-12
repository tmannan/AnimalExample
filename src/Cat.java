
public class Cat extends Animal{ 
	public  Cat() {
		System.out.println("Now I am a cat");
	}
	@Override
	public String sleep() {
		return ("A cat sleeps...");
	}
	public String eat() {
		return("A cat eats...");
	}
	public String purr() {
		return ("A cat purrs...");
	}
}
