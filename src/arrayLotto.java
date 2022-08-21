
public class arrayLotto {

	public static void main(String[] args) {
		int lotto[] = new int[6];

		// 번호 생성
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
		}
		System.out.println("로또 번호 :");
		
	for (int i=0; i<6; i++){
		System.out.println(lotto[i]+"");
	}
	
}
}
