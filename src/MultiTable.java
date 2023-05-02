public class MultiTable {
    private int number;

    public MultiTable(int number) {
        this.number = number;
    }

    public void print(){
        System.out.println(number + "단을 출력합니다.");
        for(int j = 1; j < 10; j++) {
            System.out.println(number + " * " + j + " = " + number * j);
        }
    }
}
