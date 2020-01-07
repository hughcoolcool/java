package 外部类内部类;

public class Test {
	public static void main(String[] args) {
	
	Person p = new Person();
	
	Person.Heart heart = p.new Heart();
	
	heart.jump();
	
	p.setLive(false);
	heart.jump();
	
	}
	
	

}
