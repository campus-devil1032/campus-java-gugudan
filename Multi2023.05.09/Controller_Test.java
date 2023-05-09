package mvc111;

//model과 view를 이어주는 매개체로 전체 제어
//클래스명과 메서드 명은 동일하게 만들것

public class Controller_Test {

	View_Test view_Test = new View_Test();
	Model_Test model_Test = new Model_Test();

	public Controller_Test(Model_Test model_Test, View_Test view_Test) {
		this.model_Test = model_Test;
		this.view_Test = view_Test;

	}
}
