package lesson4_operator;

public class OpEx7 {
	public static void main(String[] args) {
		//합격여부
		int score = 80;
		String pass = score >= 60 ? "합격" : "불합격";
		System.out.println(pass);
		
		//짝수인지 홀수인지
		int num = 71;
		String result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result);
		
		String s = "ABCD";
		s += "가나다라";
		s += "1234";
		System.out.println(s);
		
		
		char ch = 'A';
		char ch2 = (char)(ch + 1);
		int ch3 = ch + 1;
		//산술 형 상승 : int보다 작은 숫자 타입을 이항 연산 시 int로 변환
		System.out.println(ch2);
		System.out.println(ch3);
		
		byte b = Byte.MAX_VALUE;
		byte b1 = 1;
		byte b2 = (byte)(b - b1);
		
		System.out.println(b+" "+ b1+" "+ b2);
		
		int i = 300;
		byte b3 = (byte)i;
		
		
		System.out.println(i);
		System.out.println(b3); // 형변환되어 값손실발생
		System.out.println(Integer.toBinaryString(i)); // byte는 8비트라 앞에 짤림
	
	//유니코드에서 한글 갯수 알아보기
		System.out.println("한글 글자 개수:" + (int)('힣'-'가'+1));
		System.out.println("영어 알파벳 개수:" + (int)('Z'-'A'+1));
		System.out.println((int)('9'-'0'+1));
		
		System.out.println((int)('0'));
		System.out.println((int)('A'));
		System.out.println((int)('a'));
		
		System.out.println("======================");
	
		int cnt = 0;
		for(ch = '가' ; ch < '까' ; ch ++) {
			System.out.print(ch); // print만 쓸 경우 줄바꿈없이 이어서작성가능함
			cnt++; //갯수측정
		}
		System.out.println(cnt * 19);
		
	}
}
