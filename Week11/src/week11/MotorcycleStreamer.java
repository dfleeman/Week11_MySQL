package week11;

import java.util.stream.Collectors;

public class MotorcycleStreamer {

	public static void main(String[] args) {
		new MotorcycleStreamer().run();

	}

	// @formatter:off
	private void run() {
		String names = Motorcycle
				.getMotorcycles() 
				.stream() 										// Stream of Motorcycle
				.map(p -> p.toString()) 						// Stream of String (name)
				.sorted() 										// Sort by name (ascending)
				.collect(Collectors.joining(", ")); 			// Comma separated String

		System.out.println(names);
	}
}
