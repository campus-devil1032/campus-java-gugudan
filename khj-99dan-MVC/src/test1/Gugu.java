package test1;

public class Gugu {
	private  int number;

	public  int setNumber(int c) {
		number = c; // 인자로 받는 값을 Gugu 클래스에서 쓸 지역변수?로 만들고 
		return c;
	}

	public void getAnswer() { // 위에서 number변수에 인자 값이 들어갔으므로, 그 값을 계산!
		if(number >= 1 && number <= 999) { // 숫자의 범위는 1~99까지
			for(int i = 1; i < 10; i++) {
				System.out.println(""+number+"x"+i+" = " + number*i);
			}
    	}
    	else { // 숫자 범위 넘어가면 에러메시지
    		System.out.println("유효하지 않은 숫자입니다.");
    	}
	}
}
