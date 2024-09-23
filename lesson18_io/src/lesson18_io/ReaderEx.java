package lesson18_io;

import java.io.FileReader;
import java.io.IOException;
//문자1byte 한글 3byte
public class ReaderEx {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\tj\\Desktop\\새 텍스트 문서.txt");
		int c = 0;
		int cnt = 0;
		while((c = fr.read()) != -1) {
			cnt++;
			System.out.println((char)c);
		}
		System.out.println(cnt + "글자읽음");
		fr.close();
	}
}
