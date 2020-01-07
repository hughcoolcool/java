package USB接口;

public class Mouse implements USB{
	
	public void open() {
		System.out.println("打开我的小鼠标");
	}
	
	public void close() {
		System.out.println("关上我的小鼠标");
	}
	
	public void click() {
		System.out.println("用鼠标点击");
	}

}
