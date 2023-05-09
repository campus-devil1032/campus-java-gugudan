import java.util.Scanner;

public class Calculation {
	private double num1=0;
	private double num2=0;
	
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	private void CalPlus(double num1, double num2) {
		double res=0;
		res=this.num1 + this.num2;
		System.out.println(this.num1 + " + " + this.num2 + " = " + res);
	}
	private void CalMinus(double num1, double num2) {
		double res=0;
		res=this.num1 - this.num2;
		System.out.println(this.num1 + " - " + this.num2 + " = " + res);
	}
	private void CalMulti(double num1, double num2) {
		double res=0;
		res=this.num1 * this.num2;
		System.out.println(this.num1 + " * " + this.num2 + " = " + res);
	}
	private void CalDivide(double num1, double num2) {
		double res=0;
		res=this.num1 / this.num2;
		System.out.println(this.num1 + " / " + this.num2 + " = " + res);
		
	}
	
	
	public static void main(String[] args) {
		double iNum1 = 0;
		double iNum2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 2���� �Է����ּ��� : ");
		iNum1 = sc.nextDouble();
		iNum2 = sc.nextDouble();
		
		Calculation cal = new Calculation();
		cal.setNum1(iNum1);
		cal.setNum2(iNum2);
		
		char op;
		System.out.println("���ϰ��� �ϴ� ������ �Է����ּ��� : ");
		op = sc.next().charAt(0);
		switch (op) {
		case '+':
			cal.CalPlus(iNum1, iNum2);
			break;
		case '-':
			cal.CalMinus(iNum1, iNum2);
			break;
		case '*':
			cal.CalMulti(iNum1, iNum2);
			break;
		case '/':
			cal.CalDivide(iNum1, iNum2);
			break;
		default:
			System.out.println("�ùٸ� �����ڸ� �ٽ� �Է����ּ���");
			break;
		}

	}

}
