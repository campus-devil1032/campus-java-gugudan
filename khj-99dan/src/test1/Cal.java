package test1;

public class Cal {
	public int number;
	Cal(int number){
		this.number = number;
	}
	
	public void getAnswer() {
		for(int i = 1; i < 10; i++) {
			System.out.println(""+number+"x"+i+" = " + number*i);
		}
	}
}
