package lesson18_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\새 텍스트 문서.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\tj\\Desktop\\복사2.txt");
		System.out.println(fis.available());//가용가능공간
		byte[] bytes = new byte[5];
		
		int i = 0;
		while((i = fis.read(bytes)) != -1) {
			System.out.println(new String(bytes, 0, i));
			System.out.println(Arrays.toString(bytes)); //기존배열은 재사용됨
			fos.write(bytes, 0, i);
		}
		fis.close();//꼭 닫아주기
		fis.close();
	}
}
