package stream;

public class Fruit {

	private String name;
	
	private int quantity;
	
	public Fruit(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public Fruit order(int quantityToAdd) {
		return new Fruit(this.name, this.quantity + quantityToAdd);
	}
	
	// 出力用にtoStringをオーバーライド
	@Override
	public String toString() {
		return name + ":" + quantity + "個";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
