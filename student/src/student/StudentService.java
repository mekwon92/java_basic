package student;

import java.util.ArrayList;
//기능적 분업,재사용 신경써야함
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static student.StudentUtils.*;
//필드는 private..setter getter ..?
//멤버변수 접근자 private
//메서드는 퍼블릭(내부에서만 쓸거면 프라이빗) / 필드 프라이빗 / 생성자 프라이빗...
//logic(본 기능)
public class StudentService {
	private List<Student> students = new ArrayList<Student>();
	private List<Student> noSortedStudents;
	private List<Student> nameSortedStudents;
	private List<Student> totalSortedStudents;
	
	{
		students.add(new Student(1, "새똥이", 80, 90, 100));
		students.add(new Student(2, "개똥이", 77, 66, 77));
		students.add(new Student(3, "말똥이", 77, 44, 22));
		students.add(new Student(4, "소똥이", 77, 66, 33));
		cloneAndSort();
	}
	
//	학생등록...데이터베이스관련 단어 사용x(insert 등)..인간친화어 사용

	public void add() {
		int no = StudentUtils.next("학번", Integer.class, t -> findBy(t) == null, "중복되지않는 학번");
//		int no =nextInt("학번");
//		if(findBy(no) != null) {
//			throw new RuntimeException("중복되지않는 학번을 입력하세요");
//		}
		String name = StudentUtils.next("이름", String.class,t -> t.matches("^[가-힣]{2,4}"), "한글로 2~4글자로 입력하세요");//예외처리할게많으니 메소드로 따로 빼는게 좋음
		int kor = StudentUtils.next("국어", Integer.class,t -> t >= 0 && t <= 100 , "0~100 사이의 값");
		int eng = StudentUtils.next("영어", Integer.class,t -> t >= 0 && t <= 100 , "0~100 사이의 값");
		int mat = StudentUtils.next("수학", Integer.class,t -> t >= 0 && t <= 100 , "0~100 사이의 값");
		
		
		students.add(new Student(no, name, kor, eng, mat));
	}
	
	
	//학생 목록 조회
	public void list() {
		int input = StudentUtils.next("1. 입력순 2. 학번순 3. 이름순 4. 석차순", Integer.class, t -> t >= 1 && t <= 4, "1에서 4 사이의 수");
		List<Student> tmp = null;
		switch (input) {
		case 1:
			break;
		case 2:
			tmp = noSortedStudents;		
			break;
		case 3:
			tmp = nameSortedStudents;
			break;
		case 4:
			tmp = totalSortedStudents;
			break;
		default:
			System.out.println("????");
			break;
		}
		System.out.println("학번   이름    국어  영어  수학    총점   평균");
		System.out.println("======================================");
		for(int i = 0; i < students.size(); i++) {
			//System.out.println(students[i]);
			System.out.println(students.get(i));
		}
	}
	
	
	//학생 이름, 점수 수정
	public void modify() {
	// 1.학번을 입력 
	// 2.학번을 통한 배열탐색 >> 학생 
		Student s = findBy(nextInt("학번"));
		// 3.이름, 국어, 영어, 수학 점수 변경
		if(s == null) { //변경 - 지정한다 - setter
			System.out.println("입력한 학번은 존재하지 않습니다");
			return;
		}
		s.setName(StudentUtils.next("이름", String.class,t -> t.matches("^[가-힣]{2,4}"), "한글로 2~4글자로 입력하세요"));
		s.setKor(StudentUtils.next("국어", Integer.class,t -> t >= 0 && t <= 100 , "0~100 사이의 값"));
		s.setEng(StudentUtils.next("영어", Integer.class,t -> t >= 0 && t <= 100 , "0~100 사이의 값"));
		s.setMat(StudentUtils.next("숫자", Integer.class,t -> t >= 0 && t <= 100 , "0~100 사이의 값"));
	}
	
	//학생삭제
	public void remove() {
		int no = StudentUtils.next("학번", Integer.class, t -> findBy(t) != null, "없는학번");
		students.remove(find(no));
//		Student s = StudentUtils.next("학번", Student.class, t -> findBy(t.getNo()) != null, "없는학번");	
//		if(s == null) {
//			System.out.println("입력한 학번은 존재하지 않습니다");
//			return;
//		}
//		students.remove(s);
	}	
	
	private Student find(int no) {
		int idx = 0;
		for(int i = 0; i<students.size(); i++) {
			if(students.get(i).getNo() == no) {
				idx = i;
			}
		}
		return students.get(idx);
	}
	
	
	private Student findBy(int no) { // 1~2번 기능 겹치니까 따로 메서드 만들기
		Student student = null;
		//int no = nextInt("학번");
		for(int i = 0; i<students.size(); i++) {
			if(students.get(i).getNo() == no) { //학번 확인 - getter
				student = students.get(i);
			}
		}
		return student;
	}
	
		
	/**학생이름 유효성 검증 (이름은 반드시 한글 ,2~4글자)
	 * 
	 * @param name 학생의 이름 
	 */
	

//	String checkName(String name) {
//		char[] chs = name.toCharArray();
//		String s = new String(chs);
//		if(chs.length < 2 || chs.length > 3 ) {
//			throw new RuntimeException("이름은 2글자에서 4글자 사이로 입력하세요.");
//		}
//		//'가', '나', '다', '라'
//		for(char c : chs) {
//			if(c < '가' || c > '힣') {
//				throw new RuntimeException("한글로 구성된 이름을 입력하세요.");
//			}
//			
//		}
//		return name;
//	}
	
	
	/**범위에 대한 탐색 start 이상, end 이하의 조건을 만족하지 않을 경우 예외 발생
	 * @param num 검증대상숫자
	 * @param start 시작 값
	 * @param end 종료 값
	 * @return 원래의 값*/
	
	int checkRange(int num, int start, int end) throws RangeException{
		if(num < start || num > end) {
			throw new RangeException(start, end);
		}
		return num;
	}	
	//오버로딩
	int checkRange(int num) throws RangeException {
		return checkRange(num, 0, 100);
	}
	
	//정렬
	public void cloneAndSort() {
		noSortedStudents = new ArrayList<Student>(students);
		nameSortedStudents = new ArrayList<Student>(students);
		totalSortedStudents = new ArrayList<Student>(students);
		
		noSortedStudents.sort((a, b) -> a.getNo() - b.getNo());
		nameSortedStudents.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		Comparator<Student> comp = new MyComp();
		totalSortedStudents.sort(comp);
	
	}
	
	class MyComp implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			return o2.total()-o1.total();
		}
	}
	
	
	
}