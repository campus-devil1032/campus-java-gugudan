package test1;

public class Gugu {
	private  int number;

	public  void setNumber(int c) {
		number = c;
	}

	public void getAnswer() {
		if(number >= 1 && number <= 999) {
			for(int i = 1; i < 10; i++) {
				System.out.println(""+number+"x"+i+" = " + number*i);
			}
    	}
    	else {
    		System.out.println("��ȿ���� ���� �����Դϴ�.");
    	}
	}
}
