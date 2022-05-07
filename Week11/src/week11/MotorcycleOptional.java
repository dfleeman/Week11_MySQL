package week11;

import java.util.NoSuchElementException;
import java.util.Optional;

public class MotorcycleOptional {

	public static void main(String[] args) {
		new MotorcycleOptional().run();

	}

	private void run() {
		Motorcycle motorcycles = motorcycleMethod(Optional.of(new Motorcycle("Ducati")));
		System.out.println("I have a " + motorcycles + ".");

		try {
			motorcycleMethod(Optional.empty());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private Motorcycle motorcycleMethod(Optional<Motorcycle> motorcycleOptional) {
		return motorcycleOptional.orElseThrow(() -> new NoSuchElementException("The motorcycle does not exist."));
	}

}
