package 多态;

public class Test {
	
	public static void main(String[] args) {
		
		Animal a = new Cat();
		a.eat();
		
		Cat c = (Cat) a;
		
		c.catchMouse();
		
		
		
	}

}
