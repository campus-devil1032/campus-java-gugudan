package model;

public class calculatorModel {
	int a;
	int b;
	int result;
	String op;
	public calculatorModel(String input) {
		String[] number =input.split(" ");
		a = Integer.parseInt(number[0]);
		b = Integer.parseInt(number[1]);
	}
	public  addop{
		result = a + b;
		op = "+";
	}
	public  minusop{
		result = a + b;
		op = "-";
	}
	public  timesop{
		result = a + b;
		op = "*";
	}
	public  divideop{
		result = a + b;
		op = "/";
	}
	
}
