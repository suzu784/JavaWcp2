package wizard;

public class Hero {

	String name;
	int hp;
	
	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("適に5ポイントのダメージをあたえた！");
	}
}
