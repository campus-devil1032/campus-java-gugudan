package test1;

public class Gugu {
	private  int number;

	public  int setNumber(int c) {
		number = c; // ���ڷ� �޴� ���� Gugu Ŭ�������� �� ��������?�� ����� 
		return c;
	}

	public void getAnswer() { // ������ number������ ���� ���� �����Ƿ�, �� ���� ���!
		if(number >= 1 && number <= 999) { // ������ ������ 1~99����
			for(int i = 1; i < 10; i++) {
				System.out.println(""+number+"x"+i+" = " + number*i);
			}
    	}
    	else { // ���� ���� �Ѿ�� �����޽���
    		System.out.println("��ȿ���� ���� �����Դϴ�.");
    	}
	}
}
