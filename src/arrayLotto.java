
public class arrayLotto {

	public static void main(String[] args) {
		int lotto[] = new int[6];

		// ��ȣ ����
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
		}
		System.out.println("�ζ� ��ȣ :");
		
	for (int i=0; i<6; i++){
		System.out.println(lotto[i]+"");
	}
	
}
}
