import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = { "가위", "바위", "보" };
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 3);
			System.out.println("가위~ 바위~ 보~!");
			System.out.println(">>>");
			String b = sc.next();
			System.out.println();

			if (b.equals("가위")) {
				if (num == 0) {
					System.out.println("나: 가위");
					System.out.println("너 : 바위");
					System.out.println("졌대요~ 졌대요~");
				}
				if (num == 1) {
					System.out.println("나: 가위");
					System.out.println("너: 보");
					System.out.println("이겼습니다! ㅊㅋㅊㅋ!");
				}
				if (num == 2) {
					System.out.println("나 : 가위");
					System.out.println("너 : 가위");
					System.out.println("비겼어요!");
				}
				System.out.println();
			}
			if (b.equals("바위")) {
				if (num == 0) {
					System.out.println("나 : 바위");
					System.out.println("너 : 보");
					System.out.println("졌대요~ 졌대요~");
				}
				if (num == 1) {
					System.out.println("나 : 바위");
					System.out.println("너 : 가위");
					System.out.println("이겼습니다! ㅊㅋㅊㅋ!");
				}
				if (num == 2) {
					System.out.println("나 : 바위");
					System.out.println("너 : 바위");
					System.out.println("비겼어요!");
				}
				System.out.println();
			}
			if (b.equals("보")) {
				if (num == 0) {
					System.out.println("나 : 보");
					System.out.println("너 : 가위");
					System.out.println("졌대요~ 졌대요~");
				}
				if (num == 1) {
					System.out.println("나 : 보");
					System.out.println("너 : 바위");
					System.out.println("이겼습니다! ㅊㅋㅊㅋ!");
				}
				if (num == 2) {
					System.out.println("나 : 보");
					System.out.println("너 : 보");
					System.out.println("비겼어요!");
				}
				System.out.println();
			}
		}

	}

}
