
public class Gugudanmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gugudanclass guObject = new Gugudanclass(9); //���ڰ� ���� ���� ���ư��µ� �� �𸣰ڴ�
		guObject.setUserName("hun"); //class�� setUserName�� hun ��
		System.out.println(guObject.getUserName());

		for (int i = 2; i <= 9; i++) { // i�� 2���� 9����
			System.out.println(i + "�� ���"); 
			for (int j = 1; j <= 9; j++) { // j�� 1���� 9����
				System.out.println(i + "x" + j + "=" + i * j); //������ ����
			}
			System.out.println();
		}
	}

}
