import java.util.ArrayList;

public class Transpose {
	
	public static ArrayList<ArrayList<Double>> transpose2D(ArrayList<ArrayList<Double>> matrixIn){
		ArrayList<ArrayList<Double>> matrixOut = new ArrayList<ArrayList<Double>>();

		for(int i = 0; i < matrixIn.get(0).size(); i++){
			ArrayList<Double> temp = new ArrayList<Double>();
			for(int j = 0; j < matrixIn.size(); j++){
				temp.add(matrixIn.get(j).get(i));
			}
			matrixOut.add(temp);
		}
		return matrixOut;
	}
	
	public static ArrayList<ArrayList<Double>> transpose(ArrayList<Double> vectorIn){
		
		ArrayList<ArrayList<Double>> vectorOut = new ArrayList<ArrayList<Double>>();
		
		
		for(int i = 0; i < vectorIn.size();i++){
			ArrayList<Double> temp = new ArrayList<Double>();
			temp.add(vectorIn.get(i));
			vectorOut.add(temp);
		}
		
		return vectorOut;
	}


}
