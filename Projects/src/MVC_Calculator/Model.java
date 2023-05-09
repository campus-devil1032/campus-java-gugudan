package MVC_Calculator;
public class Model {
	void isValid(DTO dto) throws NumberFormatException,OutofNumberException{

		int intData = Integer.parseInt(dto.getStringInputData());
		dto.setInputData(intData);
		
		if((intData>9 || intData<1)){
			dto.setResult("구구단에 맞는 유효 숫자 ' 1~ 9 ' 를 입력해주세요.");
			throw new OutofNumberException("숫자이지만 1~9사이가 아닙니다.");
		}
		else {
			for(int i=intData;i<=9;i++) {
				for(int j=1;j<=9;j++) {
					dto.setResult(i + " * " + j +" = " +i*j +"\n");			
				}
			}
		}
	}
}
