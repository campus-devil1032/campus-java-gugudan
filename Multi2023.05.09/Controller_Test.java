package mvc111;

//model�� view�� �̾��ִ� �Ű�ü�� ��ü ����
//Ŭ������� �޼��� ���� �����ϰ� �����

public class Controller_Test {

	View_Test view_Test = new View_Test();
	Model_Test model_Test = new Model_Test();

	public Controller_Test(Model_Test model_Test, View_Test view_Test) {
		this.model_Test = model_Test;
		this.view_Test = view_Test;

	}
}
