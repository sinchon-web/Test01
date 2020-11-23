
public class Person {
	
	// public   : 접근제한 없음.
	// package  : 접근제한자가 생략되어잇음. (pkg범위내에서허용)
	// private  : 외부접근불가. class내에서만 접근허용
	// protected: pkg+상속class까지만 접근허용
	
	private String name;
	private int age;
	
	
	// name getter/setter	
	public String getName() {				// return type은, body내의 return value와 일치해야한다.
		return name;
	}
	public void setName(String name) {
		this.name = name;					// this.는 현재 class의 member value.
	}
	
	
	// age getter/setter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
