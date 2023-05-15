package GugudanProject;

public class GugudanController {
    private int dan;

    public GugudanController(int dan) { // 생성자

        this.dan = dan; // this: 외부에서 받아온 값을 this 에 넣음? this....
    }

    public void gugudanController() {

        GugudanModel gugudanModel = new GugudanModel(); // 모델 객체 생성
        String gugudan = gugudanModel.getGugudan(dan); // gugudan에 getGugudan메서드 리턴 값을 저장
        GugudanView gugudanView = new GugudanView(); // 뷰 객체 생성
        gugudanView.printGugudan(gugudan); // pringGugudan 메서드에 gugudan매개변수를 넣어

    }
}
