package lesson12_api;

public class Exer {
	public static void main(String[] args) {
		//1달력 출력 (최소 이번달)
		//2이전달, 3다음달, 4이전해, 5다음해, 6특정 연월 입력시 simpleformat, parse 이용해서 그 위치의 달력을 출력
		
		//url 분석(string class 사용)
		String str = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC";
		//sub..split 등으로 데이터를 잘라야 함
		//1. 프로토콜 https
		//2. 도메인 search.naver.com
		//3. 파일네임 search.naver?
		//4. 쿼리스트링 where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC
		//    (키와 벨류의 쌍으로 이루어짐) 
		//where(변수명) :: nexearch
		// sm :: top_hty  &로 구분
		//현재 위의 문자열은 5쌍의 key와 value를 가집니다..
		// 프로토콜은 ~입니다. 도메인은 ~입니다. 이런식으로
	}

}
