package lesson5_control;
//주민등록번호 검증
public class SwitchEx4 {
	public static void main(String[] args) {
		//시작숫자는 0
		String peopleNumber = "810101-1234567";
		String birth = peopleNumber.substring(0, 6);
		System.out.println(birth);
		char gender = peopleNumber.charAt(7);
		System.out.println(gender);
		
		//gender 판별
		switch (peopleNumber.charAt(7)) {
		case '1': case '3':
			System.out.println("남자");
			break;
		case '2': case '4':
			System.out.println("여자");
		}
		
	//검증코드
		//parseint를 이용해서 정수값으로 받아오기
		int num1 = Integer.parseInt(peopleNumber.substring(0, 1));
		int num2 = Integer.parseInt(peopleNumber.substring(1, 2));
		int num3 = Integer.parseInt(peopleNumber.substring(2, 3));
		int num4 = Integer.parseInt(peopleNumber.substring(3, 4));
		int num5 = Integer.parseInt(peopleNumber.substring(4, 5));
		int num6 = Integer.parseInt(peopleNumber.substring(5, 6));
		
		//char.at을 이용해서 정수값으로 갖고오기
		int num7 = peopleNumber.charAt(7) - '0';
		int num8 = peopleNumber.charAt(8) - '0';
		int num9 = peopleNumber.charAt(9) - '0';
		int num10 = peopleNumber.charAt(10) - '0';
		int num11 = peopleNumber.charAt(11) - '0';
		int num12 = peopleNumber.charAt(12) - '0';
		int num13 = peopleNumber.charAt(13) - '0';
		
		System.out.printf("%d%d%d%d%d%d-%d%d%d%d%d%d%d\n", num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13);
		
		int sum = 
				num1 * 2 + 
				num2 * 3 + 
				num3 * 4 + 
				num4 * 5 + 
				num5 * 6 + 
				num6 * 7 + 
				num7 * 8 + 
				num8 * 9 + 
				num9 * 2 + 
				num10 * 3 + 
				num11 * 4 + 
				num12 * 5;
		
		int result = (11 - sum % 11) % 10; // 검증번호
		
		System.out.println(result);
		System.out.println(result == num13); // 검증번호 일치여부확인
	}
}
