package homework.common;



public enum Operator {
        PLUS("+", (num1, num2) -> (num1 + num2)),    //Label(값1, 값2,...)
        MINUS("-", (num1, num2) -> (num1 - num2)),
        TIMES("*", (num1, num2) -> (num1 * num2)),
        DIVIDE("/", (num1, num2) -> (num1 / num2));

        private String name;    //label이 저장됨
        private final BiFunction<Integer, Integer, Integer> biFunction;        //람다식 - 아직 잘 모름

        private Operator(String name, BiFunction<Integer, Integer, Integer> biFunction) {
            this.name = name;
            this.biFunction = biFunction;
        }

        public int calculate(int num1, int num2) {
            return this.biFunction.apply(num1, num2);
        }

        public static Operator findByOperator(String input) {            //연산자로 연산Label 찾기, 이 함수를 왜 static으로 쓸까
            for (Operator operator : values()) {
                if (operator.getName().equals(input)) {
                    return operator;
                }
            }
            throw new IllegalArgumentException("계산식이 잘못 입력되었습니다.");    //연산자 잘못 입력하면 여기서 에러뜸
//			아래는 아직 모르겠어서 적어놈 참고사이트)https://attacomsian.com/blog/java-check-if-enum-exists
//			return Arrays.stream(values()).filter(operator -> operator.getName().equals(input))
//					.findFirst().orElseThrow(IllegalArgumentException::new);
        }

        public String getName() {
            return this.name;
        }
    }