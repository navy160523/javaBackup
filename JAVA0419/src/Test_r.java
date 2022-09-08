
public class Test_r {

	public static void main(String[] args) {
		/*
		 * 정수형 변수 visitCount가 0일 때
		 * "처음 오셨습니다. 방문해 주셔서 감사합니다."를 출력
		 * 
		 * visitCount와 상관없이 "방문 횟수는 XX번 입니다." 출력하는 코드
		 * 
		 * 출력결과
		 * visitCount = 0
		 * 
		 * 처음 오셨습니다. 방문해 주셔서 감사합니다.
		 * 방문 횟수는 0번 입니다.
		 * 
		 * visitCount = 5
		 * 방문 횟수는 5번 입니다.
		 */
		
		int visitCount = 1;
	
		if(visitCount == 0) {
			// 조건식 판별 결과가 true 일 때
			System.out.println("처음 오셨습니다. 방문해 주셔서 감사합니다.");
		}
		
		System.out.println("방문 횟수는 " + visitCount + "번 입니다.");
		
		System.out.println("===========================================");
		
		/*
		 * 정수형 변수 num을 선언
		 * num의 값이 3의 배수 이거나 5의 배수 이면
		 * "3의 배수 이거나 5의 배수 입니다."를 출력하고
		 * 아니면, "3의 배수 이거나 5의 배수가 아닙니다."를 출력
		 */
		
		int num = 5;
		
		if(num % 3 == 0 || num % 5 == 0) {
			System.out.println("3의 배수 이거나 5의 배수 입니다.");
		} else {
			System.out.println("3의 배수 이거나 5의 배수가 아닙니다.");
		}
		
		System.out.println("============================================");
		
		/*
		 *  영문자 인지 확인하는 코드를 작성하려고 합니다.
		 *  if문 하나만 사용해서
		 *  영문자인지 아닌지 판별하는 코드를 작성해보세요.
		 */
		char ch = '$';
		
		if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
			// ch >= 'A' && ch <= 'z'
			// 영문자 일 때
			System.out.println(ch + "는 영문자입니다.");
		} else {
			// 영문자가 아닐 때
			System.out.println(ch +"는 영문자가 아닙니다.");
		}
		
		

	}

}
