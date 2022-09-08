
public class Ex {

	public static void main(String[] args) {
		/*
		 * 접근제한자
		 * - 클래스, 메서드, 멤버변수 등의 접근 제한 용도로 사용하는 키워드
		 * - (넓음) public > protected > default > private (좁음)
		 *   => 단, default 접근제한자는 별도의 키워드 없이 생략하면 적용
		 *   
		 * 1. private 접근제한자
		 * - 외부 클래스에서 접근하지 못하며, 자신의 클래스 내에서만 접근 가능
		 * - 주로 외부에서 접근하지 못하도록 멤버변수에 적용
		 * - 자신의 클래스 내에서 private 멤버변수 값에 접근하여
		 *   멤버변수의 값을 변경하거나 리턴하는 역의 메서드를 정의하여 제공
		 *   
		 * 2. public 접근제한자
		 * - 누구나 접근 가능
		 * - 주로 외부에서 접근하는 메서드에 적용
		 * 
		 * --------------------------------------------------
		 * 
		 * Getter / Setter 메서드
		 * - 클래스 내에서 private 접근제한자로 선언된 멤버변수 등에 접근을 위해
		 *   클래스 내에서 제공하는 중개 역할의 메서드
		 * - public 접근제한자를 사용하여 정의(누구나 접근 가능)
		 * 1. Getter : 내부 멤버변수의 값을 외부로 리턴하는 메서드
		 *    => getXXX() 형식의 메서드 이름을 사용하여 정의
		 *       이 때, XXX 은 접근할 멤버변수의 이름을 사용
		 *       ex) 멤버변수 num에 접근하는 Getter 메서드 이름 : getNum()
		 *    => 파라미터는 없고, 리턴값만 있는 메서드
		 *       ex) public int getNum() {}
		 *       
		 * 2. Setter : 외부에서 값을 전달받아 내부 멤버변수에 저장하는 메서드
		 *    => setXXX() 형식의 메서드 이름을 사용하여 정의
		 *       이 때, XXX 은 접근할 멤버변수의 이름을 사용
		 *       ex) 멤버변수 num에 접근하는 Setter 메서드 이름 : setNum()
		 *    => 파라미터만 있고, 리턴값은 없는 메서드
		 *       ex) public void setNum(매개변수 선언...) {}
		 * => Getter / Setter 메서드 자동 생성 단축키
		 *    Alt + Shift + S -> R
		 * 
		 */
		// Person 클래스 인스턴스 생성 및 멤버변수 초기화
		Person p = new Person();
		p.name = "홍길동";
		p.age = 20;
		// => 특정 인스턴스의 멤버변수 값을 외부에서 함부로 변경할 경우
		//    잘못된 값을 입력하는 등 문제가 발생해도 제어가 불가능 하다!
		// => 외부에서 인스턴스 내부의 멤버변수 값을 함부로 변경하지 못하도록
		//    클래스 내에서 멤버변수 선언 시 private 접근제한자를 사용하여 선언
		
		System.out.println("===============================");
		
		// Person2 클래스 인스턴스 생성 및 멤버변수 초기화
		Person2 p2 = new Person2();
		// => Person2 클래스의 모든 멤버변수에 private 접근제한자가 적용되므로
		//    외부클래스에서 인스턴스를 통해 접근할 때 멤버변수가 보이지 않음
		// => The field Person2.name is not visible
//		p2.name = "이순신"; // 오류발생! 멤버변수 name 값 변경 불가
//		p2.age = 40; // 오류발생! 멤버변수 age 값 변경 불가
		
		// => 멤버변수에 저장할 값을 대신 전달받을 Setter 메서드 호출
		p2.setName("이순신"); // 이름을 전달받아 초기화하는 setName() 메서드 호출
		p2.setAge(40);
		
		// 멤버변수 값을 출력하기 위해 참조변수를 통해 멤버변수에 접근
		//  => 멤버변수 접근제한자가 private 이므로 외부클래스에서 접근 불가
//		System.out.println("이름 : " + p2.name); // not visible
//		System.out.println("이름 : " + p2.age); // not visible
		// => 멤버변수 값을 대신 리턴해주는 Getter 메서드 호출
		System.out.println("이름 : " + p2.getName());
		System.out.println("나이 : " + p2.getAge());
		

	}

}

class Person {
	// 멤버변수 등에 접근제한자를 생략할 경우 기본 접근제한자로 default 적용됨
	String name;
	int age;
}

class Person2 {
	// 외부에서 멤버변수 값을 함부로 변경하지 못하도록 접근 제한을 위해 설정
	// 멤버변수 선언부 앞에 private 접근제한자를 붙일 수 있다!
	private String name;
	private int age;
	
	// 멤버변수에 대신 접근하도록 Getter/Setter 메서드 정의(public 접근제한자 적용)
	// 1. Getter 메서드 정의
	//   => 파라미터는 없고, 리턴값만 있는 메서드
	// String 타입 멤버변수 name에 대한 Getter 메서드
	public String getName() {
		// 멤버변수 name 값을 외부로 리턴
		return name;
	}
	
	// int 타입 멤버변수 age에 대한 Getter 메서드
	public int getAge() {
		// 멤버변수 age 값을 외부로 리턴
		return age;
	}

	// 2. Setter 메서드 정의
	//  => 파라미터만 있고, 리턴값은 없는 메서드
	// String 타입 멤버변수 name에 대한 Setter 메서드
	public void setName(String newName) {
		// 외부로부터 전달받은 name 값(로컬변수 newName)을 멤버변수 name에 저장
		name = newName;
	}

	// int 타입 멤버변수 age에 대한 Setter 메서드
	public void setAge(int newAge) {
		// 외부로부터 전달받은 age 값(로컬변수 newAge)을 멤버변수 age에 저장
		age = newAge;
	}
	
	
}




