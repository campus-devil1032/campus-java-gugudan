
public class GugudanClass {

	public static void main(String[] args) {
		//구구단을 외자 이중 for문 이용 \t 정렬이용
		
		for(int k=1 ; k<=9 ; k++) {
			for(int i=1 ; i<=9 ; i++) {
				System.out.print(k+"*"+i+"="+k*i+"\t");
			}
			System.out.println();
		}

	}

}

