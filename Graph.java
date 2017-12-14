import java.util.*;

public class Graph {

	public static void main(String[] args) {

		read readMyFile = new read("src/RatingEx.txt");
		ArrayList<ArrayList<Double>> Ratings = readMyFile.readFileto2DArray();

		read readFile = new read("src/Brugere.txt");
		ArrayList<Double> users = readFile.readFiletoArray();

		RatMat myRatingMat1 = new RatMat(Ratings);
		ArrayList<ArrayList<Double>> Rpos = myRatingMat1.R_pos();
		ArrayList<ArrayList<Double>> Rneg = myRatingMat1.R_neg();

		ArrayList<ArrayList<Double>> W = sim.userSim(Ratings);
		ArrayList<ArrayList<Double>> V = sim.itemSim(Ratings);

		// Compute Wk and Vk
		
		ArrayList<ArrayList<Double>> Wk = KNN.ThreeNN(W);
		ArrayList<ArrayList<Double>> Vk = KNN.ThreeNN(V);
		ArrayList<ArrayList<Double>> Pm = CombinedMat.combine(Wk, Vk, Rpos);
		ArrayList<ArrayList<Double>> Nm = CombinedMat.combine(Wk, Vk, Rneg);

		ArrayList<ArrayList<Double>> P = Transition.makeProb(Pm);
		ArrayList<ArrayList<Double>> N = Transition.makeProb(Nm);

		for (int i = 0; i < P.size(); i++) {
			System.out.println(P.get(i));
		}
		System.out.println();
		System.out.println();
		
		FinTrans makeFinalTrans = new FinTrans(Rpos);
		ArrayList<ArrayList<Double>> myV = makeFinalTrans.PLine(P,0.15);


		for (int i = 0; i < myV.size(); i++) {
			System.out.println(myV.get(i));
		}
		
		System.out.println();
		System.out.println("Col: " + myV.get(0).size());
		System.out.println("Row: " + myV.size());
			}
}
