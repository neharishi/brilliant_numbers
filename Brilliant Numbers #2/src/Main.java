public class Main {

	public static Primes p = new Primes(6);
	//public static Brilliant b = new Brilliant(11);
	

	public static void main(String[] args) {
		//System.out.println(b.getBrilliants());
		//System.out.println(p.get());
		//System.out.println(p.isPrime(26));
		//System.out.println(p.get());
		//System.out.print(nextPrime(2));
		//Primes q = new Primes(3);
		//System.out.println(q.get());
		
		
		
	}
	
	public static boolean isPrime(int a){
		
		int x = 2;
		double b = a;
		double sqrt = Math.sqrt(b);
		boolean prime = true;
		while (x <= sqrt) {
			if (a % x == 0) {
				prime = false;
				break;
			}
			x++;
		}
		return prime;
	}
	
	public static int countDigits(int b) {
		int digits = 0;
		while (b != 0) {
			b = b / 10;
			digits = digits + 1;
		}
		
		return digits;
	}
	
	public static boolean sameDigits(int y, int z) {
		boolean digits = false;
		if (countDigits(y) == countDigits(z)) {
			digits = true;
		}
		return digits;
	}
	
public static boolean isBrilliant(int n) {
		
		boolean brilliant = false;
		if (Primes.getPrimeFactors(n).size() == 2 && Main.sameDigits(Primes.getPrimeFactors(n).get(0), Primes.getPrimeFactors(n).get(1))) {
			brilliant = true;
		}
		return brilliant;
	}

	
}