package exception.myexception;

import java.util.Scanner;

public class Account {

	/*
	 * 1. 잔액(balance:long) 타입으로 맴버 변수
	 * 2. deposit : 입금기능
	 * 3. withDraw : 출금기능
	 * 4. getBalnce : 잔액확인기능
	 * 
	 * 단, withDraw () 메서드에서 잔액이 출금보다 작다면  
	 * Myexception을 발생시키는 코드
	 */


	Scanner sc = new Scanner(System.in);

	private long balance; // 통장 

	public Account(long balance) {//기본 자금  <-  Account클래스의 생산자  
		this.balance = balance; 	// 기본 자금을 통장에 대입 
	}

	public void deposit() {
		System.out.println("▶ 입금금액:");
		int meny = sc.nextInt();
		balance += meny;
	}

	public void  withDraw() {
		System.out.println("▶ 출금금액:");
		int meny = sc.nextInt();
		try {
			if(balance < meny) {
				throw new MyException((meny - balance)  +"원 부족");
			}else {
				balance -= meny;
			}

		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

	}
	public void getBalance() {

		System.out.println("▶ 총 잔액: " + balance);

	}










}
