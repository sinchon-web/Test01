package Exam;
//	JEAN

public class Person {
//	접근 제한자 private 선언
	private String name;
	private int age;
	
//	멤머 name의 get메서드 정의
	public String getName() {
		return name;
	}
//	멤머 name의 set메서드 정의
	public void setName(String name) {
		this.name = name;
	}
//	멤머 age의 get메서드 정의
	public int getAge() {
		return age;
	}
//	멤머 age의 set메서드 정의
	public void setAge(int age) {
		this.age = age;
	}


}
