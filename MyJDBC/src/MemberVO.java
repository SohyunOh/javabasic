
public class MemberVO {

		private String id;
		private String pw;
		private String name;
		private String phone_number;
		
		public MemberVO() {
			// TODO Auto-generated constructor stub
		}

		public MemberVO(String id, String pw, String name, String phone_number) {
			super();
			this.id = id;
			this.pw = pw;
			this.name = name;
			this.phone_number = phone_number;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPw() {
			return pw;
		}

		public void setPw(String pw) {
			this.pw = pw;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhone_number() {
			return phone_number;
		}

		public void setPhone_number(String phone_number) {
			this.phone_number = phone_number;
		}
		
		
		
		
	

}
