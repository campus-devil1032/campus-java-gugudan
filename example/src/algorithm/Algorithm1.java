package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Algorithm1 {
	public int[] makeNewList() {
		Random rd = new Random(); // ������ü ����
		ArrayList array = new ArrayList(); // ����Ʈ��ü ����
		for (int i = 0; i < 10; i++) { // 10���� ������ ���� �ֱ�
			int num = rd.nextInt(50);
			array.add(num);
		}
		System.out.println(array);
		int[] return_array = new int[array.size()];
		for (int j = 0; j < array.size(); j++) { // ����Ʈ�� �迭�� ��ȯ�Ҷ��� stream���� �ص��ȴ�.
			return_array[j] = (int) array.get(j); // ����� ���ذ� �ȵǳ�
		}
		return return_array;

	}

	public int[] bubblesort(int arr[]) { // ���Ŀ��� �������� ����� �ִµ� ����,����,���� ��� ���� ���⼭�� ���������� ����
		int i, j, k, temp;
		j = arr.length;
		for (i = 0; i < j - 1; i++) { // �������� ��ü ���Ҹ� ���ƺ��� ����
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
						System.out.println(tmep + "�� ���� �Ҽ��Դϴ�.");
						break;
					} else if (arr[k] % i == 0) {
						tmep = arr[k];
						System.out.println(tmep + "�� ���� �Ҽ��� �ƴմϴ�.");
						break;
					}
					i--;
				}

			} catch (Exception e) {
				System.out.println("1�� �Ҽ��Դϴ�.");
			}

		}
	}
}
