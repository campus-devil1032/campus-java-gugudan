package gugudan;
import java.util.*;


public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan ex = new gugudan();

		try {
			ex.div();
		}
		catch (NumberFormatException e) {
			System.out.println("입력값에러1");

		}
		catch (InputMismatchException e) {
			System.out.println("입력값에러2");
		}
		finally {
			System.out.println("다시 시작하세요.");
		}

	}

}
