import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money;
		double doller;

		System.out.println("원화를 입력하세요>>");
		money = sc.nextInt();

		doller = (double) money;

		System.out.println(money + "원은 $" + doller + "입니다");

		sc.close();
	}

}
