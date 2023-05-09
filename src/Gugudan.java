public class Gugudan {
    private int dan;

    public Gugudan() {
    }

    public Gugudan(int dan) {
        this.dan = dan;
    }

    public void print(){
        for(int j = 1; j < 10; j++) {
            System.out.println(dan + " * " + j + " = " + dan * j);
        }
    }

    public int getDan() {
        return dan;
    }

    public void setDan(int dan) {
        if(dan < 1 || dan > 999){
            throw new IllegalArgumentException("숫자를 잘못 입력했습니다. 1부터 999 사이의 숫자를 입력해 주세요");
        }
        this.dan = dan;

    }
}
