package 酒店服务;

public class Waiter extends Employee implements VIP{

	public Waiter(String name, int iD) {
		super(name, iD);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service() {
		
		System.out.println("Waiter VIP Service");
		// TODO Auto-generated method stub
		
	}
	
	public void work() {
		System.out.println("服务客人 给客人上菜");
	}
	
	
	
	

}
