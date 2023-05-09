package campus_java;
public class VehicleWithStatic {
    public static int sum = 0;
    private int carNumber;
    private double gas;

    public VehicleWithStatic() {
        carNumber = 0;
        gas = 0.0;
        sum++;
    }

    public void setCarNumber(int carNumber, double gas) {
        this.carNumber = carNumber;
        this.gas = gas;
        System.out.println("차량번호를 " + carNumber + ", 연료를 " + gas + "로 바꿨습니다.");
    }

    public static void getSum() {
        System.out.println("자동차는 모두 " + sum + "대 있습니다.");
    }

    public void show() {
        System.out.println("차량번호: " + carNumber);
        System.out.println("연료: " + gas);
    }

}

class VehicleWithStaticMain {
    public static void main(String[] args) {
        VehicleWithStatic.getSum();

        System.out.println("-----");

        VehicleWithStatic vehicleWithStatic1 = new VehicleWithStatic();
        vehicleWithStatic1.setCarNumber(123123, 200.11);

        VehicleWithStatic.getSum();

        System.out.println("-----");

        VehicleWithStatic vehicleWithStatic2 = new VehicleWithStatic();
        vehicleWithStatic2.setCarNumber(678678, 999.99);
        VehicleWithStatic.getSum();

    }
}