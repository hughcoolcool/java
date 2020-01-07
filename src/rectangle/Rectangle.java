package rectangle;

public class Rectangle {
	
	private int width;
	private int height;
	
	public Rectangle() {
		this.width=1;
		this.height=1;
	}
	
	public Rectangle(int integer) {
		this.width=integer;
		this.height=integer;
	}
	
	public Rectangle(int width, int height) {
	
		this.width = width;
		this.height = height;
	}
	 public int getSquare() {
		return (width*height);
		 
		 
	}
	 
	 public int getLength() {
		 return (2*(width+height));
	 }
	
	 
	

}
