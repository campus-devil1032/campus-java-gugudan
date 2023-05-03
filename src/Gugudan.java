public class Gugudan {
    private int dan;

    public Gugudan() {
    }

    public Gugudan(int dan) {
        this.dan = dan;
    }

    public int getDan() {
        return dan;
    }

    public void setDan(int dan) {
        this.dan = dan;
    }

    public void print(){
        System.out.println("Model 단 입니다.");
        System.out.println(dan + "단을 출력합니다.");
        for(int j = 1; j < 10; j++) {
            System.out.println(dan + " * " + j + " = " + dan * j);
        }
    }
}
