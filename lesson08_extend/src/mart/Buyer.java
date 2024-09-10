package mart;
//ctrl + shift + f = 들여쓰기 정리
import java.util.Arrays;

public class Buyer {
	private int money;
	private Product[] cart = new Product[3];
	private int cnt;

	public Buyer(int money) {
		this.money = money;
	}

	public void buy(Product p) {
		if (cnt == cart.length) {
			cart = Arrays.copyOf(cart, cart.length * 2);
		}
		cart[cnt++] = p;
	}

	public void purchase() {
		int sum = 0;
		String names = "";
		for (int i = 0; i < cnt; i++) {
			sum += cart[i].getPrice();
			names += cart[i].getName() + ",";
		}

		int remain = money - sum;
		if (remain < 0) {
			System.out.println("결제 실패 : 잔액을 추가하거나 상품을 줄이세요");
			return; // else보다 return해서 한줄이라도 줄이기
		}

		money = remain;
		System.out.println("당신이 구매한 상품은 아래와 같습니다");
		System.out.println(names);
		System.out.println("남은 잔액은" + money + "입니다");
		cnt = 0; //
	}
}
