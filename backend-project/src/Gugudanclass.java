package Gugudan;

public class Gugudanclass {
	private int dan;
	private String userName;

	public Gugudanclass(int dan, String userName) {
		this.dan = dan;
		this.userName = userName;
	}

	public int getDan() {
		return dan;
	}

	public String getUserName() {
		return  userName; // setUserName �Է¹��� ���� ���
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}
	
}
