
public class GuguClass {
		/*
		 * M : ������ V : ����� ���, ����� C : ����� ��û �м�
		 */
		private int num;
		private String UserName;

		public GuguClass(int num) {
			this.setNum(num);

		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public String getUserName() {
			return "[ȯ���մϴ�]" + UserName;
		}

		public void setUserName(String userName) {
			UserName = userName;
		}

	}
