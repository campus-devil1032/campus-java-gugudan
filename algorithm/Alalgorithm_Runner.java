package algorithm;

public class Alalgorithm_Runner {

	public static void main(String[] args) {
		int a[];
		Algorithm1 firstAlg = new Algorithm1();
		a = firstAlg.makeNewList();
		firstAlg.bubblesort(a); //버블정렬
		firstAlg.maxValue(a); //최대값
		firstAlg.overLapValue(a); //중복된 값 찾기 대신에 이중으로 중복은 아직까진..
		
	}

}
