package 酒店服务;

public class Manager extends Employee{
	
	private double money;

	public Manager(String name, int iD,double money) {
		super(name, iD);
		this.money=money;
	}
	
	public void work() {
		
		System.out.println("经理的工作是收租");
		
	}
	

}
