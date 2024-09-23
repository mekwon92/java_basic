package lesson18_io;
import java.io.DataInputStream;
//보조스트림
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInOutEx2 {
	public static void main(String[] args) throws Exception {
//		DataOutputStream dos = new DataOutputStream(new FileOutputStream("원주율2.txt"));
//		dos.writeDouble(Math.PI);
//		
//		dos.close();
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("원주율2.txt"));
		dos.writeInt(1);//1
		dos.writeLong(10);//8
		dos.writeChar('가');//2
		dos.writeChar('a');//2
		dos.writeChars("가a"); //4
		dos.writeUTF("가a");//구분문자가 포함된다.. 총23
		
		dos.close();
		
//		DataInputStream dis = new DataInputStream(new FileInputStream("원주율2.txt"));
//		double d = dis.readDouble();
//		System.out.println(d);
//		dis.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("원주율2.txt"));
		int d = dis.readInt();
		System.out.println(d);
		System.out.println(dis.read());
		System.out.println(dis.readInt());
		System.out.println(dis.readInt());
		System.out.println(dis.readShort());
		dis.close();
	}
}
