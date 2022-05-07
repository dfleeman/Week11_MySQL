package week11;

import java.util.List;

public class MotorcycleSorter {

	public static void main(String[] args) {
		new MotorcycleSorter().run();
	}

	private void run() {
		boolean sortWithLambda = false;
		List<Motorcycle> motorcycles;
		String name;

		System.out.println("Original:" + Motorcycle.getMotorcycles());

		if (sortWithLambda) {
			motorcycles = sortWithLambda();
			name = "Lambda: ";
		}
		else {
			motorcycles = sortWithMethodReference();
			name = "Method: ";
		}
		System.out.println(name + motorcycles);
	}

	private List<Motorcycle> sortWithMethodReference() {
		List<Motorcycle> motorcycles = Motorcycle.getMotorcycles();
		motorcycles.sort(Motorcycle::compare);
		return motorcycles;
	}

	private List<Motorcycle> sortWithLambda() {
		List<Motorcycle> motorcycles = Motorcycle.getMotorcycles();
		motorcycles.sort((p1, p2) -> p1.compare(p2));
		return motorcycles;
	}

}
