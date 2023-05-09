public class overloading { //강사님 코드 클론해서 써보겠습니다
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
            System.out.println("가스 값 변경에 실패했습니다.");
        }
    }
}

class Car {
    int num;
    double gas;

    void show() {
        System.out.println("차량번호는 " + num + " 입니다.");
        System.out.println("연료는 " + gas + " 남았습니다.");
    }
}

class CarWithPrivateMember {
    private int num;
    private double gas;

    void show() {
        System.out.println("차량번호는 " + num + " 입니다.");
        System.out.println("연료는 " + gas + " 남았습니다.");
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
            System.out.println("올바른 가스 양이 아닙니다. (가능 한 수의 범위 : 0 ~ 1000). 입력 값: " + gas);
            throw new InvalidGasVolumeException();
        }
        System.out.println("현재 가스 상태를 변경했습니다 : " + this.gas);
    }
}

class InvalidGasVolumeException extends Exception {
    
}
