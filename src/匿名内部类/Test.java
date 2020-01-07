package 匿名内部类;

public class Test {
	
	public static void main(String[] args) {
		
		FlyAble f = new FlyAble() {
			
			public void fly() {
				System.out.println("flying in the sky");
		
			}
			
		};
		
		f.fly();
		
			
			
			
		
		
	}
	

}
