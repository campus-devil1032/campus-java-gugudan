package project_0504;

public class TimesTable {
	
	private int num;
	
	public TimesTable(int num) {
		this.num = num;
	}
	
	public void printTimesTable() {
		try {
			printTt(num);
			System.out.println(num + "���� ����մϴ�.");
			for(int i=1; i<10; i++) {
				System.out.println(num + " * " + i + " = " + num*i); // ����� �Է°��� 1~9�� ���� ��, ����� ���
			}
			System.out.println();
		}catch(InputOutOfBoundsException e) {
			System.out.println("1�� 999 ������ ���ڸ� �Է��ϼ���.\n");
		}
	}
	
	// ����� �Է°��� 1~999 ������ ����� �� �߻�
	public void printTt(int num) throws InputOutOfBoundsException { 
		if (num <= 0 || num > 999) {
			throw new InputOutOfBoundsException();
		}
	}
}

