package clone;

public class Hero implements Cloneable {
	String name;
	int hp;
	Sword sword;
	
	public Hero() {
	}

	
	public Hero(String name) {
		this.name = name;
	}

	
	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword.clone();
		return result;
	}

	
	public Sword getSword() {
		return sword;
	}


	public void setSword(Sword sword) {
		this.sword = sword;
	}
	
	

}
