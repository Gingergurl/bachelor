import java.util.*;

public class Copy {

	public static ArrayList<ArrayList<Double>> deepCopy2D(ArrayList<ArrayList<Double>> matrix){

		ArrayList<ArrayList<Double>> myCopy = new ArrayList<ArrayList<Double>>();
		
		for(ArrayList<Double> i : matrix){
			myCopy.add(new ArrayList<Double>(i));
		}
		
		return myCopy;
		
		//				for(int i = 0; i < matrix.size(); i++){
		//				ArrayList<Double> tempList = (ArrayList<Double>) matrix.get(i).clone();
		//				double tempListVar = (double) tempList.get(i);
		//				tempList.set(i	, new Double(tempListVar));
		//				myCopy.add(tempList);
		//			}
		//myCopy.addAll(matrix);

	}

}
