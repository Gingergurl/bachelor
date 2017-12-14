import java.util.*;

public class CombinedMat {

//	private ArrayList<ArrayList<Double>> combined;
//	private ArrayList<ArrayList<Double>> userSim;
//	private ArrayList<ArrayList<Double>> itemSim;
//	private ArrayList<ArrayList<Double>> rating;
//
//	// Constructor
//	public CombinedMat(ArrayList<ArrayList<Double>> userSim, ArrayList<ArrayList<Double>> itemSim, ArrayList<ArrayList<Double>> rating){
//		this.combined = new ArrayList<ArrayList<Double>>();
//		this.userSim = userSim;
//		this.itemSim = itemSim;
//		this.rating = rating;		
//
//	}

	
	public static ArrayList<ArrayList<Double>> combine(ArrayList<ArrayList<Double>> userSim, ArrayList<ArrayList<Double>> itemSim, ArrayList<ArrayList<Double>> rating){

		ArrayList<ArrayList<Double>> combined = new ArrayList<ArrayList<Double>>();
		
		for(int i = 0; i < userSim.size(); i++){
			ArrayList<Double> tempRow = new ArrayList<Double>();
			tempRow.addAll(0, Transpose.transpose2D(userSim).get(i));
			tempRow.addAll(Transpose.transpose2D(userSim).get(0).size(), rating.get(i));
			combined.add(tempRow);
		}

		for(int i = 0; i < Transpose.transpose2D(rating).size(); i++){
			ArrayList<Double> tempRow = new ArrayList<Double>();
			tempRow.addAll(0, Transpose.transpose2D(rating).get(i));
			tempRow.addAll(Transpose.transpose2D(rating).get(0).size(), Transpose.transpose2D(itemSim).get(i));
			combined.add(tempRow);
		}


		return combined;
		
		// Transpose Wk and Vk
//		ArrayList<ArrayList<Double>> WkT = transpose(userSim);
//		ArrayList<ArrayList<Double>> VkT = transpose(itemSim);
//
//
//		// Make copy of R (+ or -) and transpose
//		Copy copy = new Copy();
//		ArrayList<ArrayList<Double>> Rtrans = copy.deepCopy(rating);
//		Rtrans = transpose(Rtrans);
//

//		for(int i = 0; i < WkT.size(); i++){
//			ArrayList<Double> tempRow = new ArrayList<Double>();
//			tempRow.addAll(0, WkT.get(i));
//			tempRow.addAll(WkT.get(0).size(), rating.get(i));
//			combined.add(tempRow);
//		}
//
//		for(int i = 0; i < Rtrans.size(); i++){
//			ArrayList<Double> tempRow = new ArrayList<Double>();
//			tempRow.addAll(0, Rtrans.get(i));
//			tempRow.addAll(Rtrans.get(0).size(), VkT.get(i));
//			combined.add(tempRow);
//		}

	}

}
