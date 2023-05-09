
public class GugudanMvcModel {
	private int dan;
	private int[] result;
	
	private int[] calculate(int dan) { // ������ ���� ����
		int[] result = new int[9];
		for(int i =0; i<result.length; i++) {
			result[i] = dan*(i+1);
		}
		return result;
	}
	
	
	
	public void setDan(int dan) { // �Է� ��ȿ���� ���ϰ�, ��ȿ���� ������ �޼����ߵ�, ��ȿ�ϸ� ����ϵ��� �޼��� ����
		if(dan < 1 || dan > 999) {
			throw new IllegalArgumentException("�������� 1�ܺ��� 999�ܱ��� �����մϴ�.");
		}
		this.dan = dan;
		this.result = calculate(dan);
	}
	
	public int getDan() {
		return dan;
	}
	
	public int[] getResult() {
		return result;
	}
	
	
}
