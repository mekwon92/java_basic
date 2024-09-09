package marble;

public class GameService {
	int[] lands = new int[32];
	Player[] players = new Player[3];
	{
		int idx = 0;
		players[idx++] = new Player("길똥이");
		players[idx++] = new Player("새똥이");
		players[idx++] = new Player("소똥이");
	}
	public void play() {
		for(int i = 0;; i++) {
			int seq = i % players.length; 
			Player p = players[seq];
			CommonUtils.nextLine(players[seq].name + "의 차례입니다. 엔터를 누르시면 주사위를 굴립니다");
			int dice = (int)(Math.random() * 6 + 1);
			int dice2 = (int)(Math.random() * 6 + 1);
			System.out.println("====주사위의 눈은" + dice + "," + dice2 + "입니다");
			int tmpPos = p.idx + dice + dice2;
			if(tmpPos > 31) {
				System.out.println("시작점 통과!! 보너스 지급!! [30만원]");
				p.money += 300_000;
			};
			p.idx = tmpPos % 32;
			System.out.println(p);
		}
	}
}
