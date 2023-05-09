package homework;

import java.util.function.BiFunction;

public class CalculatorModel {
	private int a;				// 첫번째 값
	private int b;				// 두번째 값
	private int result;		// 결과 값 - 결과값은 set제공X, 연산에 의한 결과만 제공
	private String operatorValue;	// 연산자 
	
	public CalculatorModel(String input){	//생성자에 이렇게 모든 연산을 하는 것이 옳은 건진 모르겠음.
		String[] number = input.split("");	//사용자 입력값 - 값은 뛰어쓰기 없이 식으로 넘어옴, 한글자씩 나눠서 별도의 값으로 저장
		this.a = Integer.parseInt(number[0]);	//메인에 에러를를 처리하므로 여기서 굳이 또 throw  할 필요 없음 
		operatorValue = number[1];			//연산자 값도 함께 넘어옴
		this.b = Integer.parseInt(number[2]);
		Operator op = Operator.findByOperator(operatorValue);
		this.result = op.calculate(a, b);		//결과값까지 모두 넣기
	}

	public String getOperatorValue() {
		return operatorValue;
	}

	public void setOperatorValue(String operatorValue) {
		this.operatorValue = operatorValue;
	}

	public enum Operator{
		PLUS("+",(num1, num2) -> (num1+num2)),	//Label(값1, 값2,...)
		MINUS("-",(num1, num2) -> (num1-num2)),
		TIMES("*",(num1, num2) -> (num1*num2)),
		DIVIDE("/",(num1, num2) -> (num1/num2));
		
		private String name;	//label이 저장됨 
		private final BiFunction<Integer, Integer, Integer> biFunction; 		//람다식 - 아직 잘 모름
		private Operator(String name, BiFunction<Integer, Integer, Integer> biFunction) {
			this.name = name;
			this.biFunction = biFunction;
		}
		
		public int calculate(int num1, int num2) {
			return this.biFunction.apply(num1, num2);
		}
		
		public static Operator findByOperator(String input){			//연산자로 연산Label 찾기, 이 함수를 왜 static으로 쓸까
			for(Operator operator:values()) {
				if(operator.getName().equals(input)) {
					return operator;
				}
			}
			throw new IllegalArgumentException("계산식이 잘못 입력되었습니다.");	//연산자 잘못 입력하면 여기서 에러뜸
//			아래는 아직 모르겠어서 적어놈 참고사이트)https://attacomsian.com/blog/java-check-if-enum-exists
//			return Arrays.stream(values()).filter(operator -> operator.getName().equals(input))
//					.findFirst().orElseThrow(IllegalArgumentException::new);
		}
		public String getName() {
			return this.name;
		}
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getResult() {		
		return result;
	}

}