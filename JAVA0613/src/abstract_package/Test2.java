package abstract_package;

public class Test2 {

	public static void main(String[] args) {
//		Vehicle v = new Vehicle(); // 인스턴스 생성 불가
		// => Cannot instantiate the type Test2.Vehicle
		
		// 추상클래스 Vehicle 타입을 참조변수로 활용
		Vehicle v = new ElectricCar();
		v.reportPostion();
		v.addFuel();
		
		v = new DieselCar();
		v.reportPostion();
		v.addFuel();

	}
}

/*
 * 전기차(ElectricCar) 와 디젤차(DieselCar)의 공통적인 요소를 추상화하여
 * 차량(Vehicle) 클래스에 정의
 * - 공통요소
 *   curX, curY : 현재 위치의 좌표를 저장하는 변수
 *   reportPosition() : 연료공급지의 위치 출력
 *   ex) 현재위치 : curX, curY
 *   addFuel() : 연료공급방법 출력 
 *   ex) 전기차 충전소에서 배터리 충전!, 주유소에서 디젤 연려 공급!
 *   => 연료공급방법은 차량마다 다르며, 연료 공급은 반드시 필요한 부분이다!
 */

abstract class Vehicle {
	int curX, curY; // 현재 위치 좌표를 저장하는 변수
	
	public void reportPostion() { // 서브클래스에서 오버라이딩 옵션
		System.out.println("현재 위치 : " + curX + ", " + curY);
	}
	
//	public void addFuel() {
//		System.out.println("자동차의 연료 공급!");
//	}
	// => 차량마다 연료 공급 방법이 달라지므로 오버라딩을 해야하며
	//    오버라이딩 강제성을 부여하기 위해 추상메서드로 정의.
	public abstract void addFuel(); // 서브클래스에서 구현 필수!
	
}

class ElectricCar extends Vehicle {

	@Override
	public void addFuel() {
		System.out.println("전기차 충전소에서 배터리 충전!");
		
	}
	
}

class DieselCar extends Vehicle {

	@Override
	public void addFuel() {
		System.out.println("주유소에서 디젤 연료 공급!");
		
	}
	
}











