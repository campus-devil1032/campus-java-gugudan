public class Gugudan {
    private int dan;

    public Gugudan(int dan) {
        this.dan = dan;
    }

    public void print(){
        System.out.println(dan + "단을 출력합니다.");
        for(int j = 1; j < 10; j++) {
            System.out.println(dan + " * " + j + " = " + dan * j);
        }
    }
}
