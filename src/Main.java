import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("1 ~ 999 사이의 숫자를 입력하세요");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        try {
            int dan = Integer.parseInt(input);

            if(dan < 1 || dan > 999){
                throw new IllegalArgumentException("숫자를 잘못 입력했습니다. 1부터 999 사이의 숫자를 입력해 주세요");
            }
            Gugudan gugudan = new Gugudan(dan);
            gugudan.print();

        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력 양식입니다. 1~ 999 사이의 숫자를 입력해 주세요");
            System.out.println("NumberFormatException Exception" + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}