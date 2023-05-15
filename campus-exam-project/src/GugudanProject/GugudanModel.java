package GugudanProject;

public class GugudanModel {
    public String getGugudan(int dan) {
        StringBuilder sb = new StringBuilder(); // StringBuilder sb 생성
        for (int i = 0; i < 10; i++) { // 9번 반복
            sb.append(dan + " x " + i + " = " + (dan * i) + '\n'); // dan이 1일때 1x1=1...1X9=9 sb에 문자열 더함
        }
        return sb.toString();
    }
}