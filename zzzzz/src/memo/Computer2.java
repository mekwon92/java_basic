package memo;

public class Computer2 {
	public static void main(String[] args) {
		Game g = new Game();
		
		GraphicCard gc = new GraphicCard();
		g.display(gc);
		
		GraphicCard am = new Amd();
		g.display(am);
	}
}

