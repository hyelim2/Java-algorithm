class Mom { //�������̵� : �θ� Ŭ�������� ��ӹ��� �޼��带 �ڽ� Ŭ�������� ������ �ϴ� ��
	String m = "����";
	int age = 58;

	void info() {
		System.out.println(m + "�� ���̴�:" + age + "�Դϴ�");
	}
	void book(){
		System.out.println("å�� �����Ѵ�!");
	}
}

class Daughter extends Mom {
	String job = "���α׷���";
	void info(){
		System.out.println("���� ������"+ job+"�Դϴ�");
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
