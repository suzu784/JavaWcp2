package constructor;

public class Hero {

	String name;
	int hp;
	
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	
	public Hero() {
		this("ダミー");
	}
}
