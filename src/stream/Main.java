package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("りんご", 7));
		fruits.add(new Fruit("みかん", 15));
		fruits.add(new Fruit("いちご", 4));
		fruits.add(new Fruit("メロン", 8));
		fruits.add(new Fruit("ブドウ", 20));
		
		List<Fruit> filtered = new ArrayList<>();
		for(Fruit fruit : fruits) {
			if(fruit.getQuantity() <= 10) {
				filtered.add(fruit);
			}
		}
		
		List<Fruit> ordered = new ArrayList<>();
		for(Fruit fruit : filtered) {
			ordered.add(fruit.order(20));
		}
		
		ordered.sort(new Comparator<Fruit>() {
			@Override
			public int compare(Fruit f1, Fruit f2) {
				return f1.getQuantity() - f2.getQuantity();
			}
		});

		for(Fruit fruit : ordered) {
			System.out.println(fruit);
		}
	}

}
