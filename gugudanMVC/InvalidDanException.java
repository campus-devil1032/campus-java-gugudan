package gugudanMVC;


//단의 범위를 넘어설때 발생하는 예외
public class InvalidDanException extends Exception{
	public InvalidDanException(String errorMessage) {  
	    super(errorMessage);  
	    }  
}
