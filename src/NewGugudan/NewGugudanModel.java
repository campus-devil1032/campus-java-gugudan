package NewGugudan;

class NewGugudanModel {
	public void generateMultiplicationTable(int dan) {
		for (int i = 1; i <= 9; i++) {
			int result = dan * i;
			System.out.printf("%d * %d = %d%n", dan, i, result);
		}
	}
}