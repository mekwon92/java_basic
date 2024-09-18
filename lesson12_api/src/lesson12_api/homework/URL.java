package lesson12_api.homework;

import java.util.Arrays;

//url 분석(string class 사용)
//sub..split 등으로 데이터를 잘라야 함
//1. 프로토콜 https
//2. 도메인 search.naver.com
//3. 파일네임 search.naver
//4. 쿼리스트링 where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC
//    (키와 벨류의 쌍으로 이루어짐) 
//where(변수명) :: nexearch
// sm :: top_hty  &로 구분
public class URL {
	public static void main(String[] args) {
		String str = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC";
	//프로토콜
		System.out.println("프로토콜은 " + str.substring(0,str.lastIndexOf(":")));
	//도메인
		System.out.println("도메인은 " + str.substring(str.indexOf("/"), str.lastIndexOf("/")).substring(2));
		String domain = str.substring(str.indexOf("/"), str.lastIndexOf("/")).substring(2);
	//파일네임
		System.out.println("파일네임은 " + domain.substring(0,domain.lastIndexOf(".")));
	//쿼리스트링
		System.out.println("쿼리스트링은 " + str.substring(str.indexOf("?")));
	//쿼리스트링 분리(5쌍의 key와 value)
		System.out.println(Arrays.toString(str.substring(str.indexOf("?")).split("&")));
	}

}
