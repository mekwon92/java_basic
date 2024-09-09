package student;
//기능적 분업,재사용 신경써야함
import java.util.Arrays;
import static student.StudentUtils.*;
//필드는 private..setter getter ..?
//멤버변수 접근자 private
//메서드는 퍼블릭 / 필드 프라이빗 / 생성자 프라이빗...
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
		/*
		if(students.length == cnt) {
			students = Arrays.copyOf(students, students.length * 2);
		} //위에 있어야됨!
		System.out.println("학생의 정보를 기입하세요.");
		students[cnt] = new Student();
		students[cnt].no = StudentUtils.nextInt("학번");
		students[cnt].name = StudentUtils.nextLine("이름");
		students[cnt].kor = StudentUtils.nextInt("국어점수");
		students[cnt].eng = StudentUtils.nextInt("영어점수");
		students[cnt++].mat = StudentUtils.nextInt("수학점수");
			*/	
		if(cnt == students.length) { //꼭 미리 해야함
			students = Arrays.copyOf(students, students.length * 2);
		}
		
		int no = nextInt("학번");
		String name = nextLine("이름");
		int kor = nextInt("국어");
		int eng = nextInt("영어");
		int mat = nextInt("수학");
		students[cnt++] = new Student(no, name, kor, eng, mat);
	}
	//학생 목록 조회
	void list() {
		System.out.println("학번   이름    국어  영어  수학    총점   평균");
		System.out.println("======================================");
		for(int i = 0 ; i < cnt ; i++) {
//			System.out.printf("%4s %4s %4d %4d %4d %6d %6.2f\n",
//					students[i].no,
//					students[i].name,
//					students[i].kor,
//					students[i].eng,
//					students[i].mat,
//					students[i].total(),
//					students[i].avg()
//					);
			System.out.println(students[i]);
		}
		System.out.println(Arrays.toString(students)); //주소값확인...>재정의되어서 확인안됨
	}
	//학생 이름, 점수 수정
	void modify() {
		/*System.out.println("수정할 학생의 학번을 입력하세요.");
		students[cnt-2] = new Student();
		students[cnt-2].no = StudentUtils.nextInt("학번");
		students[cnt-2].name = StudentUtils.nextLine("이름");
		students[cnt-2].kor = StudentUtils.nextInt("국어점수");
		students[cnt-2].eng = StudentUtils.nextInt("영어점수");
		students[cnt-2].mat = StudentUtils.nextInt("수학점수");*/
	
	// 1.학번을 입력 
	// 2.학번을 통한 배열탐색 >> 학생 
		Student s = findByNo();		
		// 3.이름, 국어, 영어, 수학 점수 변경
		if(s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다");
			return;
		}
		s.setName(nextLine("이름"));
		s.setKor(nextInt("국어"));
		s.setEng(nextInt("영어"));
		s.setMat(nextInt("수학"));
	}
	
	
	Student findByNo() { // 1~2번 기능 겹치니까 따로 메서드 만들기
		Student student = null;
		int no = nextInt("학번");
		for(int i = 0; i< cnt; i++ ) {
			if(students[i].getNo() == no) {
				student = students[i];
			}
		}
		return student;
	}
		
		
	
	//학생삭제
	void remove() {
		/*System.out.println("삭제할 학생의 학번을 입력하세요");
		StudentUtils.nextInt("학번");
		students[cnt-2] = new Student();
		students[cnt-2].name = "삭제됨";
		students[cnt-2].kor = 0;
		students[cnt-2].eng = 0;
		students[cnt-2].mat = 0;
		System.out.println("삭제가 완료되었습니다");*/
		Student s = findByNo();		
		// 3.이름, 국어, 영어, 수학 점수 변경
		if(s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다");
			return;
		}
		//{1,2,3,4,5,6} 
		//{1,3,4,5,6,6}로 변경
		for(int i = 0 ; i < cnt ; i++) {
			if(students[i] == s) {//주소를 통해 물음..삭제하고 밀어내기해야됨 i=1
				System.arraycopy(students, i + 1 , students, i, cnt-- - i - 1);
				break;
			}
		
		}
	
		
		
	}
}
