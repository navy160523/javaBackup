
public class Ex3 {

	public static void main(String[] args) {
		
		int startNum = 1;
		int endNum = 10;
		
		for(int i = startNum; i <= endNum; i++) {
			System.out.println(i);
		}
		
		System.out.println("=============================");
		
		/*
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 */
		// => 위와 같이 '*'이 5개씩 5줄이 출력 되도록 for문을 작성하면??
		for(int i = 1; i <= 5; i++) { // 출력할 라인 수
			for(int j = 1; j <= 5; j++) { // * 기호의 갯수
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("===============================");
		
		/*
		 * * 		1번 라인(i = 1) = 별 1개(j = 1 ~ 1)
		 * ** 		2번 라인(i = 2) = 별 2개(j = 1 ~ 2)
		 * *** 		3번 라인(i = 3) = 별 3개(j = 1 ~ 3)
		 * **** 	4번 라인(i = 4) = 별 4개(j = 1 ~ 4)
		 * ***** 	5번 라인(i = 5) = 별 5개(j = 1 ~ 5)
		 */
		for(int i = 1; i <= 5; i++) { // 출력할 라인 수
			for(int j = 1; j <= i; j++) { // * 기호의 갯수
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("===============================");
		
		/*
		 * ***** 		5번 라인(i = 5) = 별 5개(j = 1 ~ 5)
		 * **** 		4번 라인(i = 4) = 별 4개(j = 1 ~ 4)
		 * ***	 		3번 라인(i = 3) = 별 3개(j = 1 ~ 3)
		 * ** 			2번 라인(i = 2) = 별 2개(j = 1 ~ 2)
		 * * 			1번 라인(i = 1) = 별 1개(j = 1 ~ 1)
		 */
		for(int i = 5; i >= 1; i--) { // 출력할 라인 수
			for(int j = 1; j <= i; j++) { // * 기호의 갯수
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------");
		
		/*
		 * ***** 		1번 라인(i = 1) = 별 5개(j = 1 ~ 5)(j = 5 ~ 1)
		 * **** 		2번 라인(i = 2) = 별 4개(j = 1 ~ 4)(j = 5 ~ 2)
		 * ***	 		3번 라인(i = 3) = 별 3개(j = 1 ~ 3)(j = 5 ~ 3)
		 * ** 			4번 라인(i = 4) = 별 2개(j = 1 ~ 2)(j = 5 ~ 4)
		 * * 			5번 라인(i = 5) = 별 1개(j = 1 ~ 1)(j = 5 ~ 5)
		 */
		for(int i = 1; i <= 5; i++) { // 출력할 라인 수
//			for(int j = 1; j <= (6 - i); j++) { // * 기호의 갯수
			for(int j = 5; j >= i; j--) { // * 기호의 갯수
				System.out.print("*");
			}
			System.out.println();
		}
	}

}





