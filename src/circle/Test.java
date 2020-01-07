package circle;

import java.util.Scanner;

public class Test{
	
	public static void program() {
		   System.out.println("input the circle radius plz:");
		   
		   Scanner sc = new Scanner(System.in);
		   
		   double radius = sc.nextDouble();
		   
		   if(radius<0) {
			   System.out.println("negative value try again:");
			   program();
		   }
		   
		   else {
			   Circle c = new Circle(radius);
			   System.out.println("length of circle is :"+c.getLength(radius));
		   }
}
	public static void main(String[] args) {
		
		program();
		
		

}
	
}
