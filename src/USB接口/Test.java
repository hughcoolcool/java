package USB接口;

public class Test {
	
	public static void main(String[] args) {
		
		Laptop l = new Laptop();
		
		l.run();
		USB u = new Mouse();
		l.useUSB(u);
		USB s = new Keyboard();
		l.useUSB(s);
		
		
		l.shutDown();
		
		
		
		
		
	}
	

}
