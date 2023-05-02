import java.util.Scanner;
public class multiplicationTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for (int i = 1; i < 10; i++) {
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "x" + j + "=" + i*j);
				}
			}
			
	}
	Scanner in = new Scanner(System.in);
	int c = in.nextInt();
}
