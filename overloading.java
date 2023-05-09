public class overloading { //����� �ڵ� Ŭ���ؼ� �Ẹ�ڽ��ϴ�
	//230509 am10:20
    public static void main(String[] args) {
        CarWithPrivateMember carWithPrivateMember = new CarWithPrivateMember();
        try {
            carWithPrivateMember.setGas(0.5);
            carWithPrivateMember.show();
            carWithPrivateMember.setNum(123);
            carWithPrivateMember.show();
            carWithPrivateMember.setNum(3.5);
            carWithPrivateMember.show();
            carWithPrivateMember.setNum("456");
            carWithPrivateMember.show();
        } catch (InvalidGasVolumeException e) {
            System.out.println("���� �� ���濡 �����߽��ϴ�.");
        }
    }
}

class Car {
    int num;
    double gas;

    void show() {
        System.out.println("������ȣ�� " + num + " �Դϴ�.");
        System.out.println("����� " + gas + " ���ҽ��ϴ�.");
    }
}

class CarWithPrivateMember {
    private int num;
    private double gas;

    void show() {
        System.out.println("������ȣ�� " + num + " �Դϴ�.");
        System.out.println("����� " + gas + " ���ҽ��ϴ�.");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setNum(double num) {
        this.num = (int) num;
    }

    public void setNum(String num) {
        this.num = Integer.parseInt(num);
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) throws InvalidGasVolumeException {
        if (gas > 0 && gas < 1000) {
            this.gas = gas;
        } else {
            System.out.println("�ùٸ� ���� ���� �ƴմϴ�. (���� �� ���� ���� : 0 ~ 1000). �Է� ��: " + gas);
            throw new InvalidGasVolumeException();
        }
        System.out.println("���� ���� ���¸� �����߽��ϴ� : " + this.gas);
    }
}

class InvalidGasVolumeException extends Exception {
    
}
