package day1118;

class person_김혜경{
	
	//private형태로 만드는 이유: 보안이 중요해서 클래스 외부에서 함부로 변형을 하지 못하게 막기위해
	//멤버들이 보안의 목적인 private로 지정되어있기 때문에 다른 클래스에서 접근을 못한다.
	private String name;
	private int age;

	//get set메서드를 써서 다른 클래스에서 우회해 접근할 수 있게 만든다.
	//get: private로 감춰진 변수의 값을 메모리에 저장한다.
	//set: private로 감춰진 변수의 값을 불러오거나 수정한다.
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
