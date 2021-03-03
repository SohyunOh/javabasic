package quiz02;

public class Account {

	String name;
	String password;
	int balance;
	
	Account(String pName, String pw, int bal  ) {
		name = pName;
		password = pw;
		balance = bal;
	}
	
	void deposit(int n) {
		balance += n;
	}
	
	void withDraw(int n) {
		balance -= n;
	}
	
	int getBalance() {
		return balance;
	}
	
	
	
	
	
}
