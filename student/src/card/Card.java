package card;
//롬복 라이브러리를 이용해서 트럼프 카드 게임
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//window - show view - outline 보면서 확인해보자
@NoArgsConstructor // 기본생성자 생성 Card()
@AllArgsConstructor // Card(int, int)
@Data //전부 다 생성 getter, setter, equals와 canEquals, hashCode, toString까지..

public class Card {
	//숫자기호, 모양
	private int num; // 234567890JQKA (0~12)
	private int kind; // 0 CLOVER HEART DIA SPADE (0~3)
	private boolean joker = true; //isJoker이 될 것
	
	public Card(int num, int kind) {
		this.num = num;
		this.kind = kind;
		joker = false;
	}
	
	public String toString() {
		String nums = "234567890JQKA";
		String[] kinds = {"CLOVER","HEART","DIA","SPADE"};
		return joker ? "[JOKER]":"[" + kinds[kind] + "," + nums.charAt(num) + "]";
	}
}
