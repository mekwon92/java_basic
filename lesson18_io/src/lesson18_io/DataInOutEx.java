package lesson18_io;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class DataInOutEx {
	public static void main(String[] args) throws IOException {
	System.out.println(Math.PI);
	String pi = Math.PI + "";
	char[] pis = pi.toCharArray();
	FileWriter fw = new FileWriter("원주율.txt");
	fw.write(pis);
//	fw.write(pi);도 가능함. 문자열도 바로 가능.
	fw.close();
	//텍스트파일
	//원주율값저장 관리
	//1.데이터 파일로 저장
	
	
	//2.저장된 데이터 읽어와서 확인
	FileInputStream fis = new FileInputStream("원주율.txt");
	byte[] bs = fis.readAllBytes();
	String s = new String(bs);
	System.out.println(Double.parseDouble(s));
	fis.close();
	}
}
