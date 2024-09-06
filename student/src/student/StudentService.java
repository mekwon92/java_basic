package student;
//logic 본 기능
public class StudentService {
	Student[] students = new Student[5];//필요에따라늘려야됨....
	int cnt;
	
	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);
	}
	//학생등록...데이터베이스관련단어사용x(insert 등)..인간친화어 사용
	void add() {
		System.out.println("add()");
		int no = StudentUtils.nextInt(null)
		
	}
	//학생 목록 조회
	void list() {
		System.out.println("list()");
		System.out.println("학번    이름    국어    영어     수학     총점     평균");
		System.out.println("=======================================================");
		for(int i = 0 ; i < cnt ; i++) {
			System.out.printf("%5s %6s %5d %5d %5d %5.2f\n",
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
		System.out.println("modify()");
	}
	//학생삭제
	void remove() {
		System.out.println("remove()");
	}
}
