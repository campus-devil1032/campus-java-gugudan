
package GuGuDanWithClass;

public class GuGuDanWithClassController {
	private GuGuDanWithClassModel model;
	private GuGuDanWithClassView view;

	public GuGuDanWithClassController(GuGuDanWithClassModel model, GuGuDanWithClassView view) {
		this.model = model;
		this.view = view;

	}

	public void setValue(String value) {
		model.setValue(value);
	}

	public String getValue() {
		return model.getValue();
	}

	public void setDan(String dan) {
		if (isInteger(dan)) {
			int i = Integer.parseInt(dan);
			if (i <= 0 || 999 < i) { // model을 error로 세팅
				model.setError();
			} else {
				model.setDan(dan); // model에 구구단 세팅
			}
		} else { // model을 error로 세팅
			model.setError();
		}
	}

	public String getDan() {
		return model.getDan();
	}

	public void updateView() {
		if (model.isError()) {
			   // view에게 에러 화면 띄우라고 하셈
			   view.printError();
			}
			else {
			   // 기존 view 출력 코드
		view.printGuGuDan(model.getDan(), model.getValue());
		}
	}

	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
