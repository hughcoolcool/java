package USB接口;

public class Keyboard implements USB{
	
	public void open() {
		System.out.println("打开我的小键盘");
	}
	
	public void close() {
		System.out.println("关上我的小键盘");
	}
	
	public void type() {
		System.out.println("用键盘打字");
	}
	
	
	

}
