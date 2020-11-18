package day1118;

public class Person_김소연 {

	private String name;	//보안을 위해 필드(=변수)는 private(=클래스 내부에서만 접근가능)로 만들어 우회하여 접근하도록 함.
	private int age;
	

	public String getName() {//get은 가지고 올게요(=얻어오세요)
		return name;//return은 메서드 종료
	}
	public void setName(String name) {//set은 저장할게요(=수정할게요)
		this.name = name;//return타입이  void로 되어있어서 return value가 없다.
						//this는 자기자신이 속해있는 클래스
						//.은 멤버 접근자
	}
	public int getAge() {//get은 가지고 올게요(=얻어오세요)
		return age;//return은 메서드 종료
	}
	public void setAge(int age) {//set은 저장할게요(=수정할게요)
		this.age = age;//return타입이  void로 되어있어서 return value가 없다.
						//this는 자기자신이 속해있는 클래스
						//.은 멤버 접근자
	}
		


}
