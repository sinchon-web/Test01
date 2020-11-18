package day1118;


public class Person_이돈각 {

	
	private String name;//외부의 접근 제한 private 선언
	private int age;	//외부의 접근 제한 private 선언
	
	
	//get name 메서드
	public String getName() {//리턴타입은가지고 파라미터를 정의하지않음
		return name;
	}
	//set name 메서드
	public void setName(String name) { //파라미터를 정의함
		this.name = name;			//this.name 은 private로 인한 해당클래스의 name 만 접근
	}
	//get Age 메서드
	public int getAge() { 
		return age;
	}
	//set Age 메서드
	public void setAge(int age) {
		this.age = age;
	}
	
}
