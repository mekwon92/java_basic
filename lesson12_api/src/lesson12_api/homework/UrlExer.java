package lesson12_api.homework;

//url 분석(string class 사용)
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class UrlExer {
	public static void main(String[] args) throws MalformedURLException {
		
		String str = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC";
		
		/*
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
		//key와 value 분리
		*/
		
		
		/* URL클래스 이용하기
		URL url = new URL(str);
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getPath());
		System.out.println(url.getQuery());
		*/
		
		// str = "http://www.naver.com";
		//1.프로토콜
		MyUrl myUrl = new MyUrl(str);
		myUrl.print();
	}
}

class MyUrl {
	String protocol;
	String domain;
	String filename = "";
	String[] queryStrings;

	public MyUrl(String url) {
		String str = url;
		protocol = str.substring(0,str.indexOf("://"));
		str = str.substring(str.indexOf("://")+3);
	
		//domain 초기화
		int idx = str.indexOf("/");
		if(idx < 0) {
			domain = str;
			return;
		}
		
		domain = str.substring(0 , idx);
		str = str.substring(idx+1);
		
		//filename 초기화
		idx = str.indexOf("?");
		if(idx < 0) {
			filename = str;
			return;
		}
		filename = str.substring(0, idx);
		str = str.substring(idx+1);
		System.out.println(str);
		if(str.length()==0) {
			return;
		}
		//queryString 초기화
		queryStrings = str.split("&");
		
		
		}
	
	@Override
	public String toString() {
		return "MyUrl [protocol=" + protocol + ", domain=" + domain + ", filename=" + filename + ", queryStrings="
				+ Arrays.toString(queryStrings) + "]";
	}
	public void print() {
		System.out.println("protocol=" + protocol + ", domain=" + domain + ", filename=" + filename);
		System.out.println(Arrays.toString(queryStrings));
		for(String qs : queryStrings) {
			String[] tmp = qs.split("=");
			System.out.println(tmp[0] + " ::: " + (tmp.length > 1 ? tmp[1] : "" ));
		}
	}

	
}
