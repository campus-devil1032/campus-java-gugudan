import java.util.Scanner;

public class GugudanMvcView {
	private Scanner scanner = new Scanner(System.in);

	public int inputdan() {
		System.out.print("������ ����� ����Ͻðڽ��ϱ� ? ");
		int dan = Integer.parseInt(scanner.nextLine()); // �Է¹��� ���� ���ڿ��� ������ ��ȯ�ϴ� ���
		return dan;
	}

	public void outputResult(int dan, int[] result) {
		System.out.println(dan + "���� ����մϴ�.");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d x %d = %d%n", dan, i + 1, result[i]);
        }
	}

}
