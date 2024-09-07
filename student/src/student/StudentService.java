package student;

import java.util.Arrays;

//logic(본 기능)
public class StudentService {
	Student[] students = new Student[5];//필요에따라늘려야됨....
	int cnt;
	
	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);
	}
//	학생등록...데이터베이스관련단어사용x(insert 등)..인간친화어 사용
	void add() {
		System.out.println("학생의 정보를 기입하세요.");
		students[cnt] = new Student();
		students[cnt].no = StudentUtils.nextInt("학번");
		students[cnt].name = StudentUtils.nextLine("이름");
		students[cnt].kor = StudentUtils.nextInt("국어점수");
		students[cnt].eng = StudentUtils.nextInt("영어점수");
		students[cnt++].mat = StudentUtils.nextInt("수학점수");
		if(students.length == cnt) {
		students = Arrays.copyOf(students, students.length * 2);
		}
		
	}
	//학생 목록 조회
	void list() {
		System.out.println("학번   이름    국어  영어  수학    총점   평균");
		System.out.println("======================================");
		for(int i = 0 ; i < cnt ; i++) {
			System.out.printf("%4s %4s %4d %4d %4d %6d %6.2f\n",
					students[i].no,
					students[i].name,
					students[i].kor,
					students[i].eng,
					students[i].mat,
					students[i].total(),
					students[i].avg()
					);
		}
	}
	//학생 이름, 점수 수정
	void modify() {
		System.out.println("학번을 입력하세요.");
		students[cnt-2] = new Student();
		students[cnt-2].no = StudentUtils.nextInt("학번");
		students[cnt-2].name = StudentUtils.nextLine("이름");
		students[cnt-2].kor = StudentUtils.nextInt("국어점수");
		students[cnt-2].eng = StudentUtils.nextInt("영어점수");
		students[cnt-2].mat = StudentUtils.nextInt("수학점수");
		
	}
	//학생삭제
	void remove() {
		System.out.println("삭제할 학생의 학번을 입력하세요");
		StudentUtils.nextInt("학번");
		students[cnt-2] = new Student();
		students[cnt-2].name = "삭제됨";
		students[cnt-2].kor = 0;
		students[cnt-2].eng = 0;
		students[cnt-2].mat = 0;
		System.out.println("삭제가 완료되었습니다");
	}
}
