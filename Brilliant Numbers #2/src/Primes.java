import java.util.ArrayList;

public class Primes {
	
	private ArrayList<Integer> primes;
	
	public Primes(int n) {
	
		//initialize primes
		primes = new ArrayList<Integer>();
		//call the initPrimes method
		initPrimes(n);
	}

    
//methods you need to create
public void initPrimes(int n){
	
	int count = 0;
	int num = 2;
	while (count < n) {
		if (Main.isPrime(num)) {
			primes.add(0, num);
			num += 1;
			count += 1;
		}
		else {
			num += 1;
		}
	}

}

public boolean isPrime(int n){
	boolean prime = false;
	if (n > (primes.get(0))) {
		buildPrimes(n);
		if (Main.isPrime(n)) {
			prime = true;
		}
		
	}
	else if (Main.isPrime(n)) {
		prime = true;
	}
	return prime;

}

public void buildPrimes(int n) {
	int first = primes.get(0);
	int num = primes.get(0) + 1;
	while (n >= num) {
		if (Main.isPrime(num)) {
			primes.add(0, num);
			num += 1;
			first = primes.get(0);
		}
		else {
			num += 1;
		}
	}

}

public static ArrayList<Integer> getPrimeFactors(int n){
	ArrayList<Integer> primes = new ArrayList<Integer>();
	if (n == 1) {
		primes.add(1);
		return primes;
	}
	else if (n == 2) {
		primes.add(2);
	}
	else {
	double m = n;
	int a = n;
	double sqrt = Math.sqrt(m);
	for(int i = 2; i <= sqrt; i++) {
         while(a % i == 0) {
            primes.add(i);
            a = a/i;
         }
	}
	if (a > 2) {
    	primes.add(a);
    }
	}
	return primes;
         
}



//some useful methods for later in the project
public ArrayList<Integer> get() {
	return primes;
}

public int size() {
	return primes.size();
}

public int get(int n) {
	return primes.get(n);
}
	
}