package two_week_project;

public class CalcuExamRunner {

	public static void main(String[] args) {
		CalcuExam cal = new CalcuExam();
		cal.setNum1(5);
		cal.setNum2(10);
		try {
			cal.setOperator('+');
		} catch (UserExcpetion e) {
			e.printStackTrace();
		}
		cal.show(cal.getOperator());

	}
}
