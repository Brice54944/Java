package rationals;




public class Rational implements Comparable<Rational>{

	private int num;
	private int denom;

	public Rational(int num, int denom) throws IllegalArgumentException {
		if (denom <= 0) {
			throw new IllegalArgumentException("The denominator is nul or negative");
			
		}
		else {
			int gcd = gcd(num, denom);
			this.num = num/gcd;
			this.denom = denom/gcd;
		}
	}

	public Rational(int nb) {
		this.num = nb;
		this.denom = 1;
	}

	public int getNum() {
		return num;
	}

	public int getDenom() {
		return denom;
	}

	@Override
	public String toString() {
		if (denom != 1) {
			return num + "/" + denom;
		} else {
			return num + "";
		}
	}

	/**
	 * Converts "1/3" or "4" to the corresponding rational.
	 */
	static public Rational parseRational(String s) throws Exception{
		if (s.contains("/")) {
			String[] fraction = s.split("/");
			int num = Integer.parseInt(fraction[0]);
			int denom = Integer.parseInt(fraction[1]);
			return new Rational(num, denom);
		} else {
			int num = Integer.parseInt(s);
			return new Rational(num);
		}
	}

	private int gcd(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a-b;
			}
			else {
				b = b-a;
			} 
		}
		return a;
	}

	public int compareTo(Rational r) {
		if (this.num*r.denom < this.denom * r.num) {
			return -1;
		}
		if (this.num*r.denom == this.denom * r.num) {
			return 0;
		}
		else {
			return 1;
		}
	}

	
	public boolean equals(Object o) {
		if (!(o instanceof Rational)) {
			return false;
		}
		else {
			Rational r = (Rational) o;
			if (this.compareTo(r) == 0) {
				return true;
			}
			else {
				return false;
			}
		}
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
		
		

