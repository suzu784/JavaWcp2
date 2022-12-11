package api;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		
		Man m = new Man();
		m.name = "ハルキ";
		m.hp = 100;
		System.out.println(h.toString());
		
		System.out.println(Man.money);
	}
}
