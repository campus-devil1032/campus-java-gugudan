package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Algorithm1 {
	// 랜덤 배열 생성
	public int[] makeNewList() {
		Random rd = new Random();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int num = rd.nextInt(50);
			array.add(num);
		}
		System.out.println(array);
		int[] return_array = new int[array.size()];
		for (int j = 0; j < array.size(); j++) {
			return_array[j] = (int) array.get(j);
		}
		return return_array;

	}

	// 정렬 실행 -> 버블정렬
	public int[] bubblesort(int arr[]) {
		int i, j, k, temp;
		j = arr.length;
		for (i = 0; i < j - 1; i++) {
			for (k = 0; k < j - 1; k++) {
				if (arr[k] > arr[k + 1]) {
					temp = arr[k + 1];
					arr[k + 1] = arr[k];
					arr[k] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	// 최대값 찾기
	public int maxValue(int arr[]) {
		int i, j, k, temp = 0;
		j = arr.length;
		for (i = 0; i < j - 1; i++) {
			if (arr[i] >= arr[i + 1]) {
				temp = arr[i];
			} else {
				temp = arr[i + 1];
			}
		}
		System.out.println(temp);
		return temp;
	}
	// 중복값 찾기
	public void overLapValue(int arr[]) {
		int i, j, k, temp = 0, temp1 = 0;
		j = arr.length;
		for (i = 0; i < j; i++) {
			for (k = i + 1; k < j - 1; k++) {
				if (arr[i] == arr[k]) {
					temp = arr[i];
				}
			}
		}
		System.out.println(temp);
	}
	// 소수찾기
	public void findPrimeNumber(int arr[]) {
		int i, j, k, tmep = 0;
		j = arr.length;
		for (k = 0; k < j; k++) {
			i = arr[k] / 2;
			try {
				while (true) {
					if (i == 1) {
						tmep = arr[k];
						System.out.println(tmep + " " + "소수입니다.");
						break;
					} else if (arr[k] % i == 0) {
						tmep = arr[k];
						System.out.println(tmep + " " + "소수가 아닙니다.");
						break;
					}
					i--;
				}

			} catch (Exception e) {
				e.getMessage();
			}

		}
	}
}
