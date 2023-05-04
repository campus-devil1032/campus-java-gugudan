
public class GugudanView {

	public void updateView(int GugudanAnswer) {
		try {
			System.out.printf("%d단\n", GugudanAnswer); // 몇 단인지는 한번만 출력
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d단 %d * %d = %d%n", GugudanAnswer, GugudanAnswer, j, GugudanAnswer * j);
			}
		
		}
		catch (NullPointerException e) {
			// 이 예외는 null 개체의 멤버를 참조할 때 발생합니다. Null은 아무것도 나타내지 않습니다
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			// 메서드가 문자열을 숫자 형식으로 변환할 수 없는 경우 이 예외가 발생합니다.
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			// 이것은 런타임 중에 발생하는 예외를 나타냅니다
			System.out.println(e.getMessage());
		}
	
		
		
	}
	

	
}
