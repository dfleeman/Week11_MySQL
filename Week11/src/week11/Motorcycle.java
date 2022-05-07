package week11;

import java.util.LinkedList;
import java.util.List;

public class Motorcycle {
	private String name;

	private static final List<Motorcycle> motorcycles = List.of(new Motorcycle("Honda"), new Motorcycle("Yamaha"),
			new Motorcycle("Suzuki"), new Motorcycle("Kawasaki"), new Motorcycle("Harley Davidson"));

	public Motorcycle(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + " Motorcycle";
	}

	public int compare(Motorcycle that) {
		return this.name.compareTo(that.name);
	}

	public static List<Motorcycle> getMotorcycles() {
		return new LinkedList<>(motorcycles);
	}

}
