
public class Gugudanclass {
	private int dan; 
	private String userName; 
	
	public Gugudanclass(int dan) {
		this.dan = dan;
	}

	public int getDan() {
		return dan;
	}

	public String getUserName() {
		return  "[Hello] " + userName; //Hello +  setUserName �Է� ���� ���� ���
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}
}
