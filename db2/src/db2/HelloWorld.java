package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

//17버전으로 맞춰놔야 함......
public class HelloWorld {
	public static void main(String[] args) throws Exception{
		// jar - 자바 아카이브
		System.out.println("hello world");
//		OracleDriver d;
		//0. 클래스 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//1. 접속
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "sample", "1234");
//		System.out.println(conn);
		
		//2. 문장 생성 > 실행
		Statement stmt = conn.createStatement();
		
		//3. 결과		
		// 3-1. select >> 결과집합
		ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT ORDER BY 1");
		
		while(rs.next()) {
			System.out.println(rs.getInt("STUDNO") + ":::" + rs.getString("NAME"));
		}
		// 3-2. insert, update, delete >> 반영 행의 개수
		rs.close();
		stmt.close();
		conn.close();
		
		//쿼리마다 접속,해제 해줘야햄..
		
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "sample", "1234");
		
		stmt = conn.createStatement();

		int cnt = stmt.executeUpdate("INSERT INTO STUDENT(STUDNO, NAME) VALUES (54321,'새똥이')");
		
		
		
		
	
	}
}