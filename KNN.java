import java.util.*;

public class KNN {

	public static ArrayList<ArrayList<Double>> ThreeNN(ArrayList<ArrayList<Double>> Sim) {

		ArrayList<ArrayList<Double>> KNNSim = new ArrayList<ArrayList<Double>>();

		ArrayList<ArrayList<Double>> simCopy = Copy.deepCopy2D(Sim);

		// the k in kNN
		int kNN = 3;

		for (int i = 0; i < Sim.size(); i++) {

			ArrayList<Double> row = new ArrayList<Double>();
			// sort in descending order
			Collections.sort(simCopy.get(i));
			Collections.reverse(simCopy.get(i));

			for (int j = 0; j < Sim.size(); j++) {

				for (int k = 1; k <= kNN; k++) {

					if (Sim.get(i).get(j).equals(simCopy.get(i).get(k))) {
						row.add(Sim.get(i).get(j));
						break;
					} else if (k == kNN) {
						row.add(0.0);
					}
				}
			}
			KNNSim.add(row);
		}
		return KNNSim;
	}
}
