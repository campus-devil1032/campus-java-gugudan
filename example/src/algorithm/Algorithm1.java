package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Algorithm1 {
	public int[] makeNewList() {
		Random rd = new Random(); // 랜덤객체 생성
		ArrayList array = new ArrayList(); // 리스트객체 생성
		for (int i = 0; i < 10; i++) { // 10개의 무작위 숫자 넣기
			int num = rd.nextInt(50);
			array.add(num);
		}
		System.out.println(array);
		int[] return_array = new int[array.size()];
		for (int j = 0; j < array.size(); j++) { // 리스트를 배열로 변환할때는 stream으로 해도된다.
			return_array[j] = (int) array.get(j); // 여기는 이해가 안되네
		}
		return return_array;

	}

	public int[] bubblesort(int arr[]) { // 정렬에는 여러가지 방식이 있는데 버블,선택,삽입 등등 먼저 여기서는 버블정렬을 구현
		int i, j, k, temp;
		j = arr.length;
		for (i = 0; i < j - 1; i++) { // 버블정렬 전체 원소를 돌아보기 위함
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

	public void findPrimeNumber(int arr[]) {
		int i, j, k, tmep = 0;
		j = arr.length;
		for (k = 0; k < j; k++) {
			i = arr[k] / 2;
			try {
				while (true) {
					if (i == 1) {
						tmep = arr[k];
						System.out.println(tmep + "이 수는 소수입니다.");
						break;
					} else if (arr[k] % i == 0) {
						tmep = arr[k];
						System.out.println(tmep + "이 수는 소수가 아닙니다.");
						break;
					}
					i--;
				}

			} catch (Exception e) {
				System.out.println("1은 소수입니다.");
			}

		}
	}
}
