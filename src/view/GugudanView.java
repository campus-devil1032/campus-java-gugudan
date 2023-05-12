package view;

import model.Gugudan;

public class GugudanView {
    public void getInputMessage(){
        System.out.println("구구단을 출력하겠습니다 !");
        System.out.println("1 ~ 999 사이의 숫자를 입력하세요");
    }

    /**
     * 구구단 결과 출력
     * @param gugudan
     */
    public void printResult(Gugudan gugudan){
        int dan = gugudan.getDan();
        System.out.println("----------------------");
        System.out.println(dan + " 단을 출력합니다.");
        for(int j = 1; j < 10; j++) {
            System.out.println(dan + " * " + j + " = " + dan * j);
        }
        System.out.println("----------------------");
    }
}
