package exam1;

import java.util.Scanner;

public class exam1 {
	public static void main(String[]args) {
		// TODO Auto-generated method stub

	System.out.println("아래에 단의 범위를 기입하시오 (1~9)");
	
	Scanner in = new Scanner(System.in);
	 int input1 = in.nextInt();
	 int input2 = in.nextInt();
	
	 while ((input1 < 1 || input1 > 9) || (input2 < 1 || input2 > 9)) {

		 System.out.println("INPUT ERROR!");

		 input1 = in.nextInt();

		 input2 = in.nextInt();

		 }
	 
	 if (input1 > input2) {

		 for (int i = 1; i <= 9; i++) {

		 for (int j = input1; j >= input2; j--) {

		 String result = Integer.toString(j * i);

		 if (result.length() == 1) {

		 System.out.print(j + " * " + i + " =  " + result + "   ");

		 } else

		 System.out.print(j + " * " + i + " = " + result + "   ");

		 }

		 System.out.println();

		 }



		 } else if (input2 > input1) {

		 for (int i = 1; i <= 9; i++) {

		 for (int j = input1; j <= input2; j++) {

		 String result = Integer.toString(j * i);

		 if (result.length() == 1) {

		 System.out.print(j + " * " + i + " =  " + result + "   ");

		 } else

		 System.out.print(j + " * " + i + " = " + result + "   ");

		 }

		 System.out.println();

		 }

		 } else if (input1 == input2) {

		 for (int i = 1; i <= 9; i++) {

		 String result = Integer.toString(input1 * i);

		 if (result.length() == 1) {

		 System.out.println(input1 + " * " + i + " =  " + result);

		 } else

		 System.out.println(input1 + " * " + i + " = " + result);

		 }

		 }



		 }



		}


