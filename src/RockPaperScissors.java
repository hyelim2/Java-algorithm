import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = { "����", "����", "��" };
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 3);
			System.out.println("����~ ����~ ��~!");
			System.out.println(">>>");
			String b = sc.next();
			System.out.println();

			if (b.equals("����")) {
				if (num == 0) {
					System.out.println("��: ����");
					System.out.println("�� : ����");
					System.out.println("�����~ �����~");
				}
				if (num == 1) {
					System.out.println("��: ����");
					System.out.println("��: ��");
					System.out.println("�̰���ϴ�! ��������!");
				}
				if (num == 2) {
					System.out.println("�� : ����");
					System.out.println("�� : ����");
					System.out.println("�����!");
				}
				System.out.println();
			}
			if (b.equals("����")) {
				if (num == 0) {
					System.out.println("�� : ����");
					System.out.println("�� : ��");
					System.out.println("�����~ �����~");
				}
				if (num == 1) {
					System.out.println("�� : ����");
					System.out.println("�� : ����");
					System.out.println("�̰���ϴ�! ��������!");
				}
				if (num == 2) {
					System.out.println("�� : ����");
					System.out.println("�� : ����");
					System.out.println("�����!");
				}
				System.out.println();
			}
			if (b.equals("��")) {
				if (num == 0) {
					System.out.println("�� : ��");
					System.out.println("�� : ����");
					System.out.println("�����~ �����~");
				}
				if (num == 1) {
					System.out.println("�� : ��");
					System.out.println("�� : ����");
					System.out.println("�̰���ϴ�! ��������!");
				}
				if (num == 2) {
					System.out.println("�� : ��");
					System.out.println("�� : ��");
					System.out.println("�����!");
				}
				System.out.println();
			}
		}

	}

}
