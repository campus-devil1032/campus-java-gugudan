
public class GuguClass {
		/*
		 * M : 데이터 V : 결과값 출력, 사용자 C : 사용자 요청 분석
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
			return "[환영합니다]" + UserName;
		}

		public void setUserName(String userName) {
			UserName = userName;
		}

	}
