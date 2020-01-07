package USB接口;

public class Laptop {
	
	public void run() {
		System.out.println("电脑系统开启运行");
	}
	
	public void shutDown() {
		System.out.println("电脑系统关闭");
	}
	
	public void useUSB(USB usb) {
		if(usb != null) {
			usb.open();
			//如果是鼠标
			if(usb instanceof Mouse) {
				Mouse m = (Mouse)usb;
				m.click();
			}
			//如果是键盘
			else if(usb instanceof Keyboard) {
				Keyboard kb = (Keyboard)usb;
				kb.type();
			}
			usb.close();
		}
	}
	

}
