import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = { "亜是", "郊是", "左" };
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 3);
			System.out.println("亜是~ 郊是~ 左~!");
			System.out.println(">>>");
			String b = sc.next();
			System.out.println();

			if (b.equals("亜是")) {
				if (num == 0) {
					System.out.println("蟹: 亜是");
					System.out.println("格 : 郊是");
					System.out.println("然企推~ 然企推~");
				}
				if (num == 1) {
					System.out.println("蟹: 亜是");
					System.out.println("格: 左");
					System.out.println("戚医柔艦陥! ずせずせ!");
				}
				if (num == 2) {
					System.out.println("蟹 : 亜是");
					System.out.println("格 : 亜是");
					System.out.println("搾医嬢推!");
				}
				System.out.println();
			}
			if (b.equals("郊是")) {
				if (num == 0) {
					System.out.println("蟹 : 郊是");
					System.out.println("格 : 左");
					System.out.println("然企推~ 然企推~");
				}
				if (num == 1) {
					System.out.println("蟹 : 郊是");
					System.out.println("格 : 亜是");
					System.out.println("戚医柔艦陥! ずせずせ!");
				}
				if (num == 2) {
					System.out.println("蟹 : 郊是");
					System.out.println("格 : 郊是");
					System.out.println("搾医嬢推!");
				}
				System.out.println();
			}
			if (b.equals("左")) {
				if (num == 0) {
					System.out.println("蟹 : 左");
					System.out.println("格 : 亜是");
					System.out.println("然企推~ 然企推~");
				}
				if (num == 1) {
					System.out.println("蟹 : 左");
					System.out.println("格 : 郊是");
					System.out.println("戚医柔艦陥! ずせずせ!");
				}
				if (num == 2) {
					System.out.println("蟹 : 左");
					System.out.println("格 : 左");
					System.out.println("搾医嬢推!");
				}
				System.out.println();
			}
		}

	}

}
