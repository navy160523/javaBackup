
public class Test4 {

	public static void main(String[] args) {
		// 레퍼런스 this, 생성자 this() 복습

		Account2 acc = new Account2();
		acc.showAccountInfo();
		
		System.out.println("-----------------------------");
		
		Account2 acc2 = new Account2("999-9999-999");
		acc2.showAccountInfo();
		
		System.out.println("-----------------------------");
		Account2 acc3 = new Account2("999-9999-999","이순신");
		acc3.showAccountInfo();
		
		System.out.println("-----------------------------");
		Account2 acc4 = new Account2("999-9999-999","이순신",10000);
		acc4.showAccountInfo();
		
		
	}

}

/*
 * Account2 클래스(계좌번호, 예금주명, 현재잔고) 정의
 * => 기본 생성자
 *    계좌번호를 전달받아 초기화는 생성자
 *    계좌번호, 예금주명을 전달받아 초기화하는 생성자
 *    모두 전달받아 초기화하는 생성자
 */

class Account2{
	String accountNo;
	String ownerName;
	int balance;
	
	// 기본생성자
	public Account2() {
		this("111-1111-111","홍길동",0);
		System.out.println("Account2() 생성자 호출됨!");
//		accountNo = "111-1111-111";
//		ownerName = "홍길동";
//		balance = 0;
		
	}
	
	// 계좌번호를 전달 받아서 초기화하는 생성자
	public Account2(String accountNo) {
		this(accountNo, "홍길동",0);
		System.out.println("Account2(String) 생성자 호출됨!");
//		this.accountNo = accountNo;
//		ownerName = "홍길동";
//		balance = 0;
	}
	
	// 계좌번호,예금주명을 전달 받아서 초기화하는 생성자
	public Account2(String accountNo, String ownerName) {
		this(accountNo, ownerName, 0);
		System.out.println("Account2(String, String) 생성자 호출됨!");
//		this.accountNo = accountNo;
//		this.ownerName = ownerName;
//		balance = 0;
	}
	
	// 모든 정보를 전달받아서 초기화는 생성자
	public Account2(String accountNo, String ownerName, int balance) {
		System.out.println("Account2(String, String, int) 생성자 호출됨!");
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	
}









