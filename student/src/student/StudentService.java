package student;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import static student.StudentUtils.*;

//영속화
//기능적 분업,재사용 신경써야함
//logic(본 기능)


@SuppressWarnings("unchecked")
public class StudentService {
	private List<Student> students = new ArrayList<Student>();
	private List<Student> noSortedStudents;
	private List<Student> nameSortedStudents;
	private List<Student> totalSortedStudents;
	

	{
//		ObjectInputStream ois = null;
//		try {
//			ois = new ObjectInputStream(new FileInputStream("students.txt"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			students = (List<Student>) ois.readObject();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			ois.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))){
			ois.readObject();
			students = (List<Student>) ois.readObject();
//			stream.close();//try()안에 넣어서 생략가능해짐
		}catch (FileNotFoundException e) {
			students.add(new Student(1, "새똥이", 80, 90, 100));
			students.add(new Student(2, "개똥이", 77, 66, 77));
			students.add(new Student(3, "새똥이", 80, 90, 100));
			students.add(new Student(4, "개똥이", 77, 66, 77));
			System.out.println("파일 검색 실패, 초기화 더미 데이터 처리 완료");
		} 
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		cloneAndSort();
	}
	
//	학생등록...데이터베이스관련 단어 사용x(insert 등)..인간친화어 사용

	public void add() {
//		int no = next("학번", Integer.class, n -> true, null); //어차피 여기서 처리를 안하니까 null
//		if(findBy(no) != null) {
//			throw new RuntimeException("중복되지않는 학번을 입력하세요");
//		}
		int no = next("학번", Integer.class, n -> findBy(n) == null , "중복학번 존재함");
		String name = next("이름", String.class, n -> n.matches("^[가-힣]{2,4}"), "한글로 2~4글자로 입력하세요");//예외처리할게많으니 메소드로 따로 빼는게 좋음
		int kor = next("국어", Integer.class,i -> i >= 0 && i <= 100 , "0~100 사이의 값");
		int eng = next("영어", Integer.class,t -> t >= 0 && t <= 100 , "0~100 사이의 값");
		int mat = next("수학", Integer.class,t -> t >= 0 && t <= 100 , "0~100 사이의 값");
		
		
		students.add(new Student(no, name, kor, eng, mat));
		
	}
	
	
	//학생 목록 조회
	public void list() {
		int input = next("1. 입력순 2. 학번순 3. 이름순 4. 석차순", Integer.class, t -> t >= 1 && t <= 4, "1에서 4 사이의 수");
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
//	 1.학번을 입력 
//	 2.학번을 통한 배열탐색 >> 학생 
		Student s = findBy(next("학번", Integer.class, n -> findBy(n) != null , "학번 존재안함"));	
//		if(s == null) { //변경 - 지정한다 - setter
//			System.out.println("입력한 학번은 존재하지 않습니다");
//			return;
//		}
		
//	 3.이름, 국어, 영어, 수학 점수 변경
		String name =next("이름", String.class,t -> t.matches("^[가-힣]{2,4}"), "한글로 2~4글자로 입력하세요");
		s.setName(name);
		
		int kor = next("국어", Integer.class,t -> t >= 0 && t <= 100 , "0~100 사이의 값");
		int eng = next("영어", Integer.class,t -> t >= 0 && t <= 100 , "0~100 사이의 값");
		int mat = next("숫자", Integer.class,t -> t >= 0 && t <= 100 , "0~100 사이의 값");
		s.setKor(kor);
		s.setEng(eng);
		s.setMat(mat);
	}
	
	//학생삭제
	public void remove() {
		Student s = findBy(next("학번", Integer.class, n -> findBy(n) != null , "학번 존재안함"));	
		students.remove(s);
		System.out.println("삭제완료");
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
		save();	
	}
	
	
	
	class MyComp implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			return o2.total()-o1.total();
		}
	}

//	public void bye() throws IOException {
//		ObjectOutputStream oos = null;
//		try {
//			oos = new ObjectOutputStream(new FileOutputStream("students.txt"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			oos.writeObject(students);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}		
//		oos.close();
//	}
	public void save() {
		try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("data.ser"))){
			stream.writeObject(students);
//			stream.close();//생략가능해짐
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}