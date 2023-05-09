package algorithm;
import java.util.Arrays;
public class AlalgorithmRunner {

	public static void main(String[] args) {
		int a[];
		Algorithm1 firstAlg = new Algorithm1();
		a = firstAlg.makeNewList();
		firstAlg.bubblesort(a); 
		firstAlg.maxValue(a); 
		firstAlg.overLapValue(a); 
		firstAlg.findPrimeNumber(a);
		System.out.println(firstAlg.factorial(5));
		System.out.println(firstAlg.stringReverse("dabdjsbdasdjabsdjsabndjkb"));
		System.out.println(Arrays.toString(firstAlg.findOverLapValueInString("aabbcdddasdadwdasdasdcas")));
	}

}
