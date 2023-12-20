package lambda;

@FunctionalInterface // 에노테이션 : 함수형 인터페이스라는 의미, 여러 개의 메서드 선언시 에러.
public interface MyNumber { //함수형으로 인터페이스 선언하기
	int getMax(int num1, int num2);
//	int add(int num1, int num2); 추가 메서드가 있으면 람다식 구현에 어려움 있음.
}
//lambda 패키지를 만들고 MyNumber 함수형 인터페이스를 만듭니다. 그리고
//내부에 getMax() 추상메서드를 작성.