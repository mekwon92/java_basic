package card;

import java.util.ArrayList;
import java.util.List;

public class CardMain {
	public static void main(String[] args) {
		Deck deck = new Deck();
//		deck.getCards().forEach(System.out::println);
		deck.shuffle();
		
		System.out.println("첫번째 플레이어의 손덱");
		System.out.println(deck.pick());
		System.out.println(deck.pick());
		System.out.println(deck.pick());
		System.out.println(deck.pick());
		System.out.println(deck.pick());
		
		System.out.println("두번째 플레이어의 손덱");
		System.out.println(deck.pick());
		System.out.println(deck.pick());
		System.out.println(deck.pick());
		System.out.println(deck.pick());
		System.out.println(deck.pick());
		
		System.out.println("덱의 카드");
		deck.printCards();
	}
}
