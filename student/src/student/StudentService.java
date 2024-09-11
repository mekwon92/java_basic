package student;
//기능적 분업,재사용 신경써야함
import java.util.Arrays;

import static student.StudentUtils.*;
//필드는 private..setter getter ..?
//멤버변수 접근자 private
//메서드는 퍼블릭(내부에서만 쓸거면 프라이빗) / 필드 프라이빗 / 생성자 프라이빗...
//logic(본 기능)
public class StudentService {
	private Student[] students = new Student[5];//필요에따라늘려야됨....
	private int cnt;
	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);
	}
//	학생등록...데이터베이스관련 단어 사용x(insert 등)..인간친화어 사용

	public void add() {
			
		if(cnt == students.length) { //꼭 미리 해야함
			students = Arrays.copyOf(students, students.length * 2);
		}
		
		int no = 0;
		no = nextInt("학번");
		try {
			for(int i = 0; i < cnt ; i++) {
				if(no == students[i].getNo()) {
					System.out.println("중복된 학번이 있습니다. 다시입력하세요");
					return;
				}
			}	
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
			
		} 
		
		String name = nextLine("이름");
		if(name.length()> 3 || name.length() < 2) {
			System.out.println("이름의 길이는 2~3글자입니다.");
			return;
		}
		int kor = nextInt("국어");
		if(kor < 0 || kor > 100) {
			System.out.println("0에서 100 사이의 값을 입력하세요.");
			return;
		}
		int eng = nextInt("영어");
		if(eng < 0 || eng > 100) {
			System.out.println("0에서 100 사이의 값을 입력하세요.");
			return;
		}
		int mat = nextInt("수학");
		if(mat < 0 || mat > 100) {
			System.out.println("0에서 100 사이의 값을 입력하세요.");
			return;
		}
		
		
		
		students[cnt++] = new Student(no, name, kor, eng, mat);
	}
	//학생 목록 조회
	public void list() {
		System.out.println("학번   이름    국어  영어  수학    총점   평균");
		System.out.println("======================================");
		for(int i = 0 ; i < cnt ; i++) {
			System.out.println(students[i]);
		}
		System.out.println(Arrays.toString(students)); //주소값확인...>재정의되어서 확인안됨
	}
	//학생 이름, 점수 수정
	public void modify() {
	// 1.학번을 입력 
	// 2.학번을 통한 배열탐색 >> 학생 
		Student s = findByNo();		
		// 3.이름, 국어, 영어, 수학 점수 변경
		if(s == null) { //변경 - 지정한다 - setter
			System.out.println("입력한 학번은 존재하지 않습니다");
			return;
		}
		s.setName(nextLine("이름"));
		s.setKor(nextInt("국어"));
		s.setEng(nextInt("영어"));
		s.setMat(nextInt("수학"));
	}
	
	
	private Student findByNo() { // 1~2번 기능 겹치니까 따로 메서드 만들기
		Student student = null;
		int no = nextInt("학번");
		for(int i = 0; i< cnt; i++ ) {
			if(students[i].getNo() == no) { //학번 확인 - getter
				student = students[i];
			}
		}
		return student;
	}
		
		
	
	//학생삭제
	public void remove() {
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
