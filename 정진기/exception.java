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
			System.out.println("�Է°�����1");

		}
		catch (InputMismatchException e) {
			System.out.println("�Է°�����2");
		}
		finally {
			System.out.println("�ٽ� �����ϼ���.");
		}

	}

}
