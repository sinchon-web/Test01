
public class Person_신학철 {
	
	//private 외부에서 접근제한 ,데이더 숨김 ,수정x
	private String name;
	private int age;
	
	public String getName() {//name 접근제한 데이터를 가지고 온다
		return name;//return 값 반환
	}
	public void setName(String name) {//name 접근제한 데이터를 출력해준다
		this.name = name;
	}
	
	public int getAge() { //age 접근제한 데이터를 가지고 온다
		return age;
	}
	public void setAge(int age) { //age 접근제한 데이터를 출력해준다
		this.age = age;
	}

	
}
