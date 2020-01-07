package 外部类内部类;

public class Person {

	private boolean live = true;
	
	public boolean isLive() {
		return live;
	}

	public void setLive(boolean live) {
		this.live = live;
	}

	 class Heart{
		
		public void jump() {
			
			if(live) {
				System.out.println("是你在跳");
			}
			else{
			
					System.out.println("死了 不跳");
				}
				
			}
		
			
			
			
		}
		
	}
	
	
	
	
	

