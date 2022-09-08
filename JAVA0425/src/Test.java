
public class Test {

	public static void main(String[] args) {
		// 특정 단의 구구단 출력
//		int dan = 9;
//		System.out.println(" < " + dan + "단 >");
//		
//		for(int i = 1; i <= 9; i++) {
//			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
//		}
		
		// while 문을 사용하여 구구단 2단 출력
		int dan = 2;
		System.out.println(" < " + dan + "단 >");
		
		int i = 1;
		
		while(i <= 9) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			i++;
		}
		
		// while 문을 사용하여 정수 1 ~ 10까지의 합(total)을 계산 후 출력
		int total = 0;
		
		int num = 1; // 초기식
		while(num <= 10) { // 조건식
			total += num;
			num++; // 증감식
		}
		
		System.out.println("1 ~ 10까지 정수의 합 = " + total);
		
	}
}






