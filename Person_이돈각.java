package day1118;


public class Person_이돈각 {

	
	private String name;//호출 할 수 없는 접근자 선언
	private int age;	//호출 할 수 없는 접근자 선언
	
	
	
	public String getName() {//리턴타입은가지고 파라미터를 정의하지않음
		return name;
	}
	public void setName(String name) { //파라미터를 정의함
		this.name = name;			//this.name 은 private로 인한 해당클래스의 name 만 접근
	}
	public int getAge() { 
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
