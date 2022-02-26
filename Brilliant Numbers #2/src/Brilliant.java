import java.util.ArrayList;

public class Brilliant {
	ArrayList<Integer> brilliants =  new ArrayList<Integer>();//initialize this
	

	public Brilliant(int n) {
		initBrilliants(n);

	}
	
		
	
public void initBrilliants(int n) {
	int num = 4;
	int count = 0;
	while (count < n) {
		if (Main.isBrilliant(num)) {
			brilliants.add(num);
			num += 1;
			count += 1;
		}
		else {
			num += 1;
		}
	}

}


public ArrayList<Integer> getBrilliants() {
		return brilliants;
	}

	public int size() {
		return brilliants.size();
	}
}
