package gugudan;

public class View {
	//구구단 이쁘게 출력하기
	public void gugudanView(int[] arr,int dan) {
		System.out.printf("%d단--------\n",dan);
		for (int i = 1; i < arr.length+1; i++) {
			System.out.printf("%d * %d = %d\n",dan,i,arr[i-1]);
		}
	}
	
}
