package homework;

import homework.common.OperatorVersion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: View는 Service Layer의 존재를 몰라도 된다.
// TODO: Controller는 분기처리만 할뿐 어떤 비즈니스 로직도 가지지 않는다.


public class ApplicationService {
    private CalculatorController calculatorController = new CalculatorController();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public String input; // 입력값 처리

    public void start() {
        OperatorVersion2.DIVIDE.name();
        boolean isRun = true;    //while문 반복 변수, while-switch구문을 써주어 while문을 빠져나올 키워드 필요
        while (isRun) {
            input = null; // null값을 전역에서 사용해 while들어면 초기화
            menuView(); // 메뉴를 띄운다
            try {
                input = br.readLine(); // 입력받은 메뉴값
                CalculatorController.MenuNumber menu = CalculatorController.MenuNumber.findByValue(input);
                switch (menu) {
                    case QUITE:
                        isRun = false;
                        break;
                    case GUGUDAN:
                        calculateGugudan();
                        break;
                    case CALCULATOR:
                        commonCaculate();
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요");
            } catch (DanValueOverflowException e) {
                System.out.println("1~999까지만 입력 가능합니다.");
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            } catch (IOException e) {
                System.out.println("잘못 입력햇습니다.");
            }
        }
        System.out.println("프로그램이 종료되었습니다.");


        controller.inputData();    //프로그램 실행
    }
}
