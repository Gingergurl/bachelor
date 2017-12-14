import java.util.ArrayList;

public class sim {
//	private ArrayList<ArrayList<Double>> matR;
//	ArrayList<ArrayList<Double>> W;
//	ArrayList<ArrayList<Double>> V; 
	
//	public sim(ArrayList<ArrayList<Double>> matR){
//		this.matR = matR;
//		W = new ArrayList<ArrayList<Double>>();
//		V = new ArrayList<ArrayList<Double>>();
//	}

	
	public static ArrayList<ArrayList<Double>> userSim(ArrayList<ArrayList<Double>> matR){
		
		ArrayList<ArrayList<Double>> W = new ArrayList<ArrayList<Double>>();
		 
		for(int i = 0; i < matR.size(); i++){

			ArrayList<Double> rows = new ArrayList<Double>();
	        
			for(int j = 0; j < matR.size(); j++){
				
				double dotProduct = 0.0;
				double firstNorm = 0.0; 
				double secondNorm = 0.0;
				double cosinSimilarity = 0.0;
				
				if(i == j){
					rows.add(1.0);
				}
				else{
					for(int k = 0; k < matR.get(0).size(); k++) {
				        dotProduct += (matR.get(i).get(k) * matR.get(j).get(k));
				        firstNorm += Math.pow(matR.get(i).get(k), 2);
				        secondNorm += Math.pow(matR.get(j).get(k), 2);
				    }
					cosinSimilarity = (dotProduct / (Math.sqrt(firstNorm) * Math.sqrt(secondNorm)));
					rows.add(cosinSimilarity);
				}
			}
			W.add(rows);
		}
		return W;			
	}
	
	public static ArrayList<ArrayList<Double>> itemSim(ArrayList<ArrayList<Double>> matR){
		
		ArrayList<ArrayList<Double>> V = new ArrayList<ArrayList<Double>>();
		
		for(int i = 0; i < matR.get(0).size(); i++){
			
			ArrayList<Double> rows = new ArrayList<Double>();
			
			for(int j = 0; j < matR.get(0).size(); j++){
				
				double dotProduct = 0.0; 
				double firstNorm = 0.0;
				double secondNorm = 0.0;
				double cosineSimilarity = 0.0;
				
				if(i == j){
					rows.add(1.0);
				}
				else{
					for(int k = 0; k < matR.size(); k++){
						dotProduct += (matR.get(k).get(i)*matR.get(k).get(j));
						firstNorm += Math.pow(matR.get(k).get(i), 2);
						secondNorm += Math.pow(matR.get(k).get(j), 2);
					}
					cosineSimilarity = (dotProduct / (Math.sqrt(firstNorm) * Math.sqrt(secondNorm)));
					rows.add(cosineSimilarity);
				}
			}
			V.add(rows);
		}
		return V;
	}

}
