import java.util.*;

public class Transition {

	private static ArrayList<Double> calcSum(ArrayList<ArrayList<Double>> matrixIn) {
		// calculating sum
		ArrayList<Double> sums = new ArrayList<Double>();

		for (int i = 0; i < matrixIn.get(0).size(); i++) {
			double sum = 0.0;

			for (int j = 0; j < matrixIn.size(); j++) {
				sum += matrixIn.get(j).get(i);
			}
			sums.add(sum);
		}
		return sums;
	}

	public static ArrayList<ArrayList<Double>> makeProb(ArrayList<ArrayList<Double>> matrixIn) {

		ArrayList<ArrayList<Double>> matrixOut = Copy.deepCopy2D(matrixIn);
		ArrayList<Double> sums = calcSum(matrixOut);
		
			for(int i = 0; i < matrixOut.get(0).size(); i++){
				for(int j = 0; j < matrixOut.size(); j++){
					
					if(matrixOut.get(j).get(i) != 0.0){
						matrixOut.get(j).set(i, matrixOut.get(j).get(i)/sums.get(i));
					}
				}
			}
		
			

		return matrixOut;

		// ArrayList<Double> means = new ArrayList<Double>();
		//
		// for(int i = 0; i < matrix.size(); i++){
		// double mean = 0.0;
		// int count = 0;
		//
		// for(int j = 0; j < col; j++){
		// if(matrix.get(i).get(j) != 0){
		// mean += matrix.get(i).get(j);
		// count++;
		// }
		// }
		// mean = mean/count;
		// means.add(mean);
		// }
	}

}
