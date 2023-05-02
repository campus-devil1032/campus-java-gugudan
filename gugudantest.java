package test;

import java.util.Scanner;

public class gugudantest {
	public static void main(String[] args){
		int dan = 0;
		System.out.println("단 수를 입력하세요");
		Scanner in = new Scanner(System.in);
		dan = in.nextInt();
		
		while(true) { //예외 처리 
			if(dan <= 0 || dan > 999) {
				System.out.println("단 수를 다시 입력하세요");
				dan = in.nextInt();
			}
			else
				break;
		}
		
		Gugudan gu = new Gugudan();
		gu.makeGugudan(dan); 
	}
}

class Gugudan{ //구구단 기능 메인에서 분리 
	public void makeGugudan(int dan){
		
		for(int i=1; i<=9; i++){
			System.out.println(dan+" X "+i+" = "+(dan*i));
		}
	}
}