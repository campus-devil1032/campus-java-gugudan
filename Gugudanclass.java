class Gugudan {
    int num;

    public void Gugudan(int num) {
        this.num = num;
        for (int n = 1; n <= 9; n++) {
            System.out.println(num + "단:" + num + "x" + n + (num * n));
        }
    }
}

public class Gugudanclass {
    public static void main(String [] args) {
        Gugudan gugudantest=new Gugudan ();
        gugudantest.Gugudan(2);

    }
}