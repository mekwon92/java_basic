package student;
//value object 값 
public class Student {
	
	//필드
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	
	//생성자
	
	public Student() {}
	
	public Student(int no, String name, int kor, int eng, int mat) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//점수 총점.평균계산 메소드
	
	int total() {
		return kor + eng + mat;//this필요없음
	}
	
	double avg() {
		return total() / 3d;
	}
}
