import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 구구단 클래스
 */

public class Gugudan {
    /**
     * 전체 로직을 정리하고 결과를 출력하는 Method
     */
    public static void main(String[] args) {
        while (true) {
            int num = setNum(); // 원하는 함수, class에 접근 (ctrl + 좌측 클릭)
            if (num == 0) break; // 만약 숫자가 0에 도달하면 종료해라(break)
            else if (num == -1) continue; // 만약 숫자가 -1이 나오면 while문으로 다시 돌아가서 입력 받아라(continue)
            gugudan(num);
        }
        System.out.println("종료합니다.");
    }
    // break, continue는 가장 가까운 반복문에 영향을 끼친다 -> 제동을 걸어줌

    /**
     * 원하는 구구단을 입력 받는 Method
     *
     * @return num 원하는 단수
     * @throws IOException            정상 입력이 아닌 경우
     * @throws NumberFormatException 숫자 입력이 아닌 경우
     * @throws MinusException         음수의 입력인 경우
     */

    // 함수는 return을 만나면 종료된다
    // throw : 내가 예외처리 할게 -> try-catch 문 사용
    // throws : 내가 절대 처리 안 할 거야 남한테 예외를 던져라
    public static int setNum() {
        String value = "";
        System.out.print("원하는 단을 입력하세요. (입력은 양수만 가능합니다. 종료를 원하면 0을 입력하세요.)\n>> ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            value = br.readLine(); // String
            int num = Integer.parseInt(value);
            if (num < 0) throw new MinusException();
            return num;
            catch(IOException e){
                System.out.println("[ERROR] 입력한 " + value + " 은 정상 입력이 아닙니다. 다시 입력해 주세요.");
            catch(NumberFormatException e){
                    System.out.println("[ERROR] 입력한 " + value + " 은 숫자가 아닙니다. 다시 입력해 주세요.");
            catch(MinusException e){
                        System.out.println("[ERROR] 입력한 " + value + " 은 음수입니다. 다시 입력해 주세요.");
                    }
                    System.out.println("=============================================================================");
                    return -1;
                }

            }
            /**
             * num단의 결과 출력하기
             * @param num 원하는 단수
             * */

            public static void gugudan ( int num){
                StringBuffer sb = new StringBuffer();
                for (int i = 1; i < 10; i++)
                    sb.append(num).append(" * ").append(" = ").append(num * i).append("\n");
            }
            //System.out.println(sb.deleteCharAt(sb.length() - 1));
            System.out.println(sb);
            System.out.println("=============================================================================")
        }

        /**
         * 음수가 들어오는 경우의 class
         */
        public static class MinusException extends Exception {
            public MinusException() {
                super();
            }

            public MinusException(String msg) {
                super(msg);
            }
        }
    }
}

