package homework;

public class Calculator_Model {	//데이터 가공 처리
	private String dan;		//입력받을 값
	private int[] result=new int[9];	//결과값
	
	public Calculator_Model(String dan) {
		this.dan = dan;
	}
	
//	public int[] calculateDan() {
//		for(int j =1;j<=9;j++) 
//			result[j-1]=Integer.parseInt(this.dan)*j;
//		return result;
//	}
	
	public boolean isValidDan(){
		try {
			int number = Integer.parseInt(dan);
			if(number>999||number<1)
					throw new DanValueOverflowException("잘못된 범위입니다.");
			return true;
		} catch(NumberFormatException e){
			System.out.println("숫자를 입력해주세요");
			return false;
		}catch(DanValueOverflowException e) {
			return false;
		}
	}

	public String getDan() {
		return dan;
	}

	public void setDan(String dan) {
		this.dan = dan;
	}

	public int[] getResult() {
		for(int j =1;j<=9;j++) 
			result[j-1]=Integer.parseInt(this.dan)*j;
		return result;
	}	
}
