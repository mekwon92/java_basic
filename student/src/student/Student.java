package student;
//value object 값 
public class Student {
	//java beans 명세서에 맞게끔 수정
	//field private , method public
	//에러가 안나게 서비스에서 제어하세요...
	
	//필드
	private int no; //getter setter를 설정해야함...
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	//생성자
	
	public Student() { } 
	
	public Student(int no, String name, int kor, int eng, int mat) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//getter setter 생성자 직후
	//no getter
	public int getNo() {
		return no;
	}
	//no setter
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
	
	
	
	
	public String toString() { //간단하게만들어주기
		return String.format("%4s %4s %4d %4d %4d %6d %6.2f", no, name, kor, eng, mat, total(), avg());
	}
	
	
	
	
	//점수 총점.평균계산 메소드
	
	public int total() {
		return kor + eng + mat;//this필요없음
	}
	
	public double avg() {
		return total() / 3d;
	}
}
