
public class Controller {
	public void isValid(Model model) {
		try {
			int intData = Integer.parseInt(model.getStringInputData());
			model.setInputData(intData);
			if(!(0<intData&&intData<10)){
				model.setResult("1~9사이의 숫자가 아닙니다.");
			}else
				for(int i=model.getInputData();i<=9;i++) {
					for(int j=1;j<=9;j++) {
						System.out.println(i + " * "+ j + " = " + i*j);				
					}
				}
			model.setInputData(intData);
		} catch (NumberFormatException e) {
			model.setResult("숫자로 변형될수 없는 글자가 들어왔습니다");
		}
	}
}
