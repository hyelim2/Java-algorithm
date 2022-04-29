
public class Arr {

	public static void main(String[] args) {
		char[] abc = { 'A', 'B', 'C', 'D' };
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		// 배열 abc와 num을 붙여서 하나의 배열 (result)로 만든다
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);

		// 배열 abc를 배열num의 첫번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);

		// number의 인ㄷㅔㄱ스 6 위치에 3개 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}

}
