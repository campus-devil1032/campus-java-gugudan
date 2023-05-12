package model;

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

    public void setDan(int dan) throws IllegalArgumentException {
        if(dan < 1 || dan > 999){
            throw new IllegalArgumentException("숫자를 잘못 입력했습니다. 1부터 999 사이의 숫자를 입력해 주세요");
        }
        this.dan = dan;

    }
}
