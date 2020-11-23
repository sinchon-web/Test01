
public class Person_최예라 {
	
	//접근제한자 생략되어있다.(package 범위내에서 허용)
	//protected : (package+상속관계 허용)
	//public : 접근제한 범위가 없다(어디서든지 허용)
	//private : 외부 접근금지 (클래스 내부에서만 허용)
	private String name;
	private int age;
	
	public void setAge(int age) {
		this.age=age;
		
	}
	public int getAge() {
		return age;
	}
	
	//name의 수정하도록 set메서드정의 
	public void setName(String name) {
		this.name = name;
		//this 는 현재 클래스이다.
	}

	//name의 값을 읽어오는 get메서드
	public String getName() {
		return name;
	}
}
