package card;
//card service와 유사
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Getter;

@Getter
public class Deck {
	private List<Card> cards = new ArrayList<>();
	{
		init();
	}
	
	//init
	public void init() {	
		for(int i = 0; i < 52; i++) {
			cards.add(new Card(i % 13, i / 13)); //순환,지연..이뭐더라!?
		}
		cards.add(new Card());
		cards.add(new Card());
	}
	
	//한장뽑기
	public Card pick() {
		return cards.remove(0);
	}
	
	//섞기
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	//확인용
	public void printCards() {
		cards.forEach(System.out::println);
		System.out.println("========="+cards.size()+"장 남음=========");
	}
}
