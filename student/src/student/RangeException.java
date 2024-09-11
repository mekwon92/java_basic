package student;
/*처음에 a입력..
 * 1~5에서 다른거입력... 
 * 점수가너무높거나 낮거나.....
 * 이름은 반드시 한글..완성형...최소 2글자 최대 4글자...
 * 학번중복불허
 * 중간에 오류상황 발생시 정지되지않기. 초기화면으로 가도록 
 * 학번 오름차순, 이름 오름차순, 점수 오름차순 석차 */

public class RangeException extends RuntimeException{
	int start;
	int end;
	
	public RangeException(int start, int end) {
		this(start, end, start + "이상" + end + "이하의 값을 입력하세요");
	}

	public RangeException(int start, int end, String msg) {
		super(msg);
		this.start = start;
		this.end = end;
	}
}
