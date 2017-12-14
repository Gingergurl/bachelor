import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class read {

	private String filename;
	private Scanner input;

	public read(String filename) {
		this.filename = filename;
		this.input = null;
	}

	// Metode til at indlæse fil til rating matrix
	public ArrayList<ArrayList<Double>> readFileto2DArray() {

		// Initialize variables
		

		// Read file
		try {
			input = new Scanner(new File(filename));

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		ArrayList<ArrayList<Double>> ratings = new ArrayList<ArrayList<Double>>();
		// int i = 0;
		while (input.hasNextLine()) {
			ArrayList<Double> list = new ArrayList<Double>();
			ratings.add(list);
			String line = input.nextLine();
			for (String s : line.split(" ")) {
				list.add(Double.parseDouble(s));
			}
		}
		input.close();
		return ratings;
	}

	public ArrayList<Double> readFiletoArray() {

		// Initialize variables
		

		// Read file
		try {
			input = new Scanner(new File(filename));

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		ArrayList<Double> arrayIn = new ArrayList<Double>();
		// int i = 0;
		while (input.hasNextDouble()) {
			arrayIn.add(input.nextDouble());
		}
		input.close();
		return arrayIn;
	}
}
