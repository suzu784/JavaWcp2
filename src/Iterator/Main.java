package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("みなと");
		names.add("あさか");
		names.add("すがわら");
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
	}

}
