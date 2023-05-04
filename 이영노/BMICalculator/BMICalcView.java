
public class BMICalcView {

	public void MBICalcDetails(double total) {

		try {
		if (total < 18.5) {
			System.out.println("저제충입니다.");
		} else if (total < 23) {
			System.out.println("정상체중입니다.");
		} else if (total < 25) {
			System.out.println("과체중입니다.");
		} else if (total < 30) {
			System.out.println("경도비만입니다.");
		} else if (total > 30) {
			System.out.println("고도비만입니다.");
		}

		System.out.println(total);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
