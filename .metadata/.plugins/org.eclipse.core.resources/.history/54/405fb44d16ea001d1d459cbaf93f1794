
package GuGuDanWithClass;

public class GuGuDanWithClassModel {
	private String dan;
	private String value;

	public String getDan() {
		return dan;
	}

	public void setDan(String dan) {
		this.dan = dan;
	}

	public String getValue() {
		value = "";
		for (int i = 1; i <= 9; i++) {
			value += dan + " * " + i + " = " + (Integer.parseInt(dan) * i) + "\n";
		}
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private boolean isError;

	public void setError() {
		this.isError = true;
	}

	public void resetError() {
		this.isError = false;
	}

	public boolean isError() {
		return this.isError;
	}
}
