import java.util.ArrayList;

public class RatMat {
	
	private ArrayList<ArrayList<Double>> matrix;
	private ArrayList<Double> allMeans;
		
	
	// Constructor
	public RatMat(ArrayList<ArrayList<Double>> matrix){
		this.matrix = matrix;
		allMeans = means.makeMeans(matrix);
		
	}
	
	// Method for making R+	
	public ArrayList<ArrayList<Double>> R_pos(){
		
		int col = matrix.get(0).size();
		ArrayList<ArrayList<Double>> myRpos = new ArrayList<ArrayList<Double>>();
		
		for(int i = 0; i < matrix.size(); i++){
			ArrayList<Double> tempRow = new ArrayList<Double>();
			
			for(int j = 0; j < col; j++){
				if(matrix.get(i).get(j) > allMeans.get(i)){
					tempRow.add(matrix.get(i).get(j) - allMeans.get(i));
				}
				else tempRow.add(0.0);				
			}
			myRpos.add(tempRow);
		}
		return myRpos;
	}
		
	// Method for making R-
	public ArrayList<ArrayList<Double>> R_neg(){
			
		int col = matrix.get(0).size();
		ArrayList<ArrayList<Double>> myRneg = new ArrayList<ArrayList<Double>>();
			
		for(int i = 0; i < matrix.size(); i++){
			ArrayList<Double> tempRow = new ArrayList<Double>();

			for(int j = 0; j < col; j++){
				
				if(matrix.get(i).get(j) < allMeans.get(i) && matrix.get(i).get(j) != 0.0){
					tempRow.add(allMeans.get(i) - matrix.get(i).get(j));
				}
				else tempRow.add(0.0);
			}
			myRneg.add(tempRow);
		}
		return myRneg;
	}

}
