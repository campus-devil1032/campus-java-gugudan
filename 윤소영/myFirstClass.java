import java.util.Scanner;

public class myFirstClass {
	public static void main(String[] args) {
		
		Integer num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����ұ��? : ");
		num = sc.nextInt();
		try {
			printGugudan(num);
			System.out.println(num + "���� ����մϴ�.");
			for(int i=1; i<10; i++) {
				System.out.println(num + " * " + i + " = " + num*i);
			}
			System.out.println();
		}catch(MyException e) {
			System.out.println("1�� 999 ������ ���ڸ� �Է��ϼ���.");
			System.out.println();
			}
	}
	
	static void printGugudan(int num) throws MyException { 
		if ((num <= 0) || (num > 999)) {
			throw new MyException();
		}
	}
}

class MyException extends Exception {	
	MyException() {
	}
}
