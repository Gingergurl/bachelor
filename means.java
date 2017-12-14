import java.util.ArrayList;

public class means {
	
//	private ArrayList<ArrayList<Double>> matrix;
//	
//	public means(ArrayList<ArrayList<Double>> matrix){
//		this.matrix = matrix;
//	}
	
	
	public static ArrayList<Double> makeMeans(ArrayList<ArrayList<Double>> matrix){
		int col = matrix.get(0).size();
		
		// Computing means
		ArrayList<Double> means = new ArrayList<Double>();
		
		for(int i = 0; i < matrix.size(); i++){
			double mean = 0.0;
			int count = 0;
		
			for(int j = 0; j < col; j++){
				if(matrix.get(i).get(j) != 0){
					mean += matrix.get(i).get(j);
					count++;
				}
			}
			mean = mean/count;
			means.add(mean);
		}
		return means;
	}
}
