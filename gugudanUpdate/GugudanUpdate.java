package gugudanUpdate;

public class GugudanUpdate {
	public static void main(String[] args) {
		try {
			Calculator c = new Calculator();
			c.getCalculator();
		} catch (ConditionException e) {
			System.out.println(e.getMessage());
		}

	}
}
