package 酒店服务;

public class Chef extends Employee implements VIP{

	public Chef(String name, int iD) {
		super(name, iD);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service() {
		System.out.println("Chef vip cooking");
		
	} 
	
	public void work() {
		System.out.println("Chef cooking");
	}
	

}
