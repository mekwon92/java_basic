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
	private Student[] totalSortedStudents; 
	private Student[] noSortedStudents; 
	private Student[] nameSortedStudents; //clone 후 정렬
	private int cnt;
	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);
		students[cnt++] = new Student(3, "말똥이", 77, 44, 22);
		students[cnt++] = new Student(4, "소똥이", 77, 66, 33);
		cloneAndSort();
		
	}
//	학생등록...데이터베이스관련 단어 사용x(insert 등)..인간친화어 사용

	public void add() {	
		int no =nextInt("학번");
		if(findBy(no) != null) {
			throw new RuntimeException("중복되지않는 학번을 입력하세요");
		}
		String name = checkName(nextLine("이름"));//예외처리할게많으니 메소드로 따로 빼는게 좋음
		int kor = checkRange(nextInt("국어"));
		int eng = checkRange(nextInt("영어"));
		int mat = checkRange(nextInt("수학"));
		
		
		if(cnt == students.length) { //꼭 미리 해야함
			students = Arrays.copyOf(students, students.length * 2);
		}
		
		students[cnt++] = new Student(no, name, kor, eng, mat);
	}
	
	
	//학생 목록 조회
	public void list() {
		int input = checkRange(nextInt("1. 입력순 2. 학번순 3. 이름순 4. 석차순"),1,4);
		Student[] tmp = null;
		switch (input) {
		case 1:
			tmp = students;
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
			break;
		}
		System.out.println("학번   이름    국어  영어  수학    총점   평균");
		System.out.println("======================================");
		for(int i = 0 ; i < cnt ; i++) {
			//System.out.println(students[i]);
			System.out.println(tmp[i]);
		}
		//System.out.println(Arrays.toString(students)); //주소값확인...>재정의되어서 확인안됨
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
		s.setName(checkName(nextLine("이름"))); //위에꺼랑다른..왜!
		s.setKor(checkRange(nextInt("국어")));
		s.setEng(checkRange(nextInt("영어")));
		s.setMat(checkRange(nextInt("수학")));
	}
	
	//학생삭제
	public void remove() {
		Student s = findBy(nextInt("학번"));		
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
	
	
	private Student findBy(int no) { // 1~2번 기능 겹치니까 따로 메서드 만들기
		Student student = null;
		//int no = nextInt("학번");
		for(int i = 0; i< cnt; i++ ) {
			if(students[i].getNo() == no) { //학번 확인 - getter
				student = students[i];
			}
		}
		return student;
	}
	
		
	/**학생이름 유효성 검증 (이름은 반드시 한글 ,2~4글자)
	 * 
	 * @param name 학생의 이름 
	 */
	String checkName(String name) {
		char[] chs = name.toCharArray();
		String s = new String(chs);
		if(chs.length < 2 || chs.length > 3 ) {
			throw new RuntimeException("이름은 2글자에서 4글자 사이로 입력하세요.");
		}
		//'가', '나', '다', '라'
		for(char c : chs) {
			if(c < '가' || c > '힣') {
				throw new RuntimeException("한글로 구성된 이름을 입력하세요.");
			}
			
		}
		return name;
	}
	
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
		noSortedStudents = students.clone();
		nameSortedStudents = students.clone();
		totalSortedStudents = students.clone();
		
		sort(0, noSortedStudents);
		sort(0, nameSortedStudents);
		sort(0, totalSortedStudents);
	}
	
	
	private void sort(int type, Student[] target) {
		Student[] arr = target;
		//회차반복
		for(int i = 0; i < cnt - 1 ; i++) {
			//비교반복
			for(int j = 0; j < cnt - 1 - i ; j++) { // 0,1,2,3
				//값 비교 후 자리 교환
				boolean condition = false;
				switch (type) {
				case 0:
					condition = arr[j].getNo() > arr[j+1].getNo();
					break;
				case 1:
					condition = arr[j].getName().compareTo(arr[j+1].getName()) > 0;
					break;
				case 2:
					condition = arr[j].total() < arr[j+1].total();
					break;
				default:
					break;
				}
				if(arr[j].total() < arr[j+1].total()) {
					Student tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;	
				}	
			}
		}
	}
	
	
	
	
	
	
}