package MVC_gugudan;

public class GugudanModel {
    public void calculateGugudan(int input) throws Exception {
        if (input < 1 || input > 999) { // 입력한 값이 1~999 범위 밖이면 예외 발생
            throw new Exception();
        }
        for (int i = 1; i < 10; i++) {
            System.out.println(input * i);
        }
    }
}
