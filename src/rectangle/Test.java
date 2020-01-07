package rectangle;

public class Test {
	
	public static void main(String[] args) {
		
		
		Rectangle rec2 = new Rectangle(2);
		int i = rec2.getLength();
		int s = rec2.getSquare();
		
	System.out.println(i);
	System.out.println(s);
		
		Rectangle rec1 = new Rectangle(2,3);
		rec1.getLength();
		rec1.getSquare();
		int a = rec1.getLength();
		int b = rec1.getSquare();
		System.out.println(a);
		System.out.println(b);
		
		
		
		
	}

}
