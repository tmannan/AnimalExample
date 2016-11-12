
public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		System.out.println(a.sleep());
		
		System.out.println(a.eat());
		Cat c = new Cat();
		System.out.println(c.sleep());
		System.out.println(c.purr());
		System.out.println(c.eat());
		
		Bird b = new Bird();
		System.out.println(b.sleep());
		System.out.println(b.eat());
		System.out.println(b.fly());
		
		Animal bb = new Bird();
		System.out.println(bb.sleep());
		System.out.println(bb.eat());
		//System.out.println(bb.fly());

	}

}
