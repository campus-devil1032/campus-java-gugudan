package gugudan;

import java.util.Arrays;

public class View {
	public void prettyView(int[] arr,int dan) {
		System.out.printf("%d단--------\n",dan);
		for (int i = 1; i < arr.length+1; i++) {
			System.out.printf("%d * %d = %d\n",dan,i,arr[i-1]);
		}
	}
}
