
	public class Person_김소연92 {
	//접근제한자가 생략(package범위내에서허용)
	//public :어디서든 허용(접근제한x)
	//protected :(package+상속관계 허용)
	//private : 외부접근금지(클래스내부에서만 허용)
		private String name;
		private int age;
		
	//name의 수정하도록 set메서드 정의
		public void setName(String name) {
			this.name = name;//this. 는 현재 클래스
		}
		public String getName() {
			return name;//리턴값이 같아야함
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getAge() {
			return age;
		}
	}

