import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money;
		double doller;

		System.out.println("��ȭ�� �Է��ϼ���>>");
		money = sc.nextInt();

		doller = (double) money;

		System.out.println(money + "���� $" + doller + "�Դϴ�");

		sc.close();
	}

}
