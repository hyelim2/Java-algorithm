class Mom { //오버라이딩 : 부모 클래스에서 상속받은 메서드를 자식 클래스에서 재정의 하는 것
	String m = "엄마";
	int age = 58;

	void info() {
		System.out.println(m + "의 나이는:" + age + "입니다");
	}
	void book(){
		System.out.println("책을 좋아한다!");
	}
}

class Daughter extends Mom {
	String job = "프로그래머";
	void info(){
		System.out.println("딸의 직업은"+ job+"입니다");
	}
}

public class testet {

	public static void main(String[] args) {
		Mom mom = new Mom();

		
		Daughter dau = new Daughter();
		dau.info();
		dau.book();
		

	}

}
