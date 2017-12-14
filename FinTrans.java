import java.util.*;


public class FinTrans {

	private ArrayList<ArrayList<Double>> ratings;

	public FinTrans(ArrayList<ArrayList<Double>> ratings) {
		this.ratings = ratings;
	}

	private ArrayList<ArrayList<Double>> E() {

		read readUsers = new read("src/Brugere.txt");
		ArrayList<Double> vLine = readUsers.readFiletoArray();
		ArrayList<ArrayList<Double>> groupRat = new ArrayList<ArrayList<Double>>();
		ArrayList<ArrayList<Double>> E = new ArrayList<ArrayList<Double>>();
		
		int num = 0;

		for (int i = 0; i < ratings.size(); i++) {
			if (vLine.get(i) == 1) {
				groupRat.add(ratings.get(i));
				num++;
			}
		}

		for (int i = 0; i < groupRat.get(0).size(); i++) {
			double count = 0;
			for (int j = 0; j < groupRat.size(); j++) {
				if (groupRat.get(j).get(i) != 0.0) {
					count++;
					num++;
				}
			}
			vLine.add(count);
		}

		ArrayList<Double> v = new ArrayList<Double>();

		for (int i = 0; i < vLine.size(); i++) {
			if (vLine.get(i) != 0.0) {
				v.add(vLine.get(i) / num);
			} else
				v.add(0.0);
		}
		
		for(int i = 0; i < v.size(); i++){
			ArrayList<Double> temp = new ArrayList<Double>();
			for(int j = 0; j < v.size(); j++){
				temp.add(v.get(i));
			}
			E.add(temp);
		}

		return E;
	}
	
	public ArrayList<ArrayList<Double>> getE(){
		return E();
	}
	
	public ArrayList<ArrayList<Double>> PLine(ArrayList<ArrayList<Double>> PN, double d){
		
		ArrayList<ArrayList<Double>> newPN = Copy.deepCopy2D(PN);
		ArrayList<ArrayList<Double>> newE = E();
		ArrayList<ArrayList<Double>> PNline = new ArrayList<ArrayList<Double>>(); 
		
		for(int i = 0; i < PN.size(); i++){
			for(int j = 0; j < PN.get(0).size(); j++){
				newPN.get(i).set(j, (1-d)*newPN.get(i).get(j));
				newE.get(i).set(j, d*newE.get(i).get(j));
			}
		}
				
		for(int i = 0; i < PN.size(); i++){
			ArrayList<Double> sum = new ArrayList<Double>(); 
			for(int j = 0; j < PN.get(0).size(); j++){
				sum.add(newPN.get(i).get(j)+newE.get(i).get(j));
			}
			PNline.add(sum);
		}
		return PNline;
	}

}
