package algorithm;

public class Alalgorithm_Runner {

	public static void main(String[] args) {
		int a[];
		Algorithm1 firstAlg = new Algorithm1();
		a = firstAlg.makeNewList();
		firstAlg.bubblesort(a); //��������
		firstAlg.maxValue(a); //�ִ밪
		firstAlg.overLapValue(a); //�ߺ��� �� ã�� ��ſ� �������� �ߺ��� ��������..
		firstAlg.findPrimeNumber(a);
	}

}
