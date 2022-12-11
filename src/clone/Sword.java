package clone;

public class Sword implements Cloneable {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Sword(String name) {
		super();
		this.name = name;
	}

	public Sword() {
		super();
	}

	public Sword clone() {
		Sword result = new Sword();
		result.name = this.name;
		return result;
	}
}
