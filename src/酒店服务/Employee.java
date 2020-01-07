package 酒店服务;

public class Employee{
	
	private String name;
	private int ID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Employee(String name, int iD) {
		super();
		this.name = name;
		ID = iD;
	}
	
	public void work() {
		System.out.println("职员就是要工作");
	}
	
	
	

}
