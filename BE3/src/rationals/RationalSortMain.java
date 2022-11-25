package rationals;
import java.util.ArrayList;
import java.util.Collections;

public class RationalSortMain {

	public static void main(String[] args) throws Exception{
		ArrayList<Rational> rationals = new ArrayList<>();
		rationals.add(new Rational(1));
		rationals.add(new Rational(1, 3));
		rationals.add(new Rational(4, 3));
		rationals.add(new Rational(2, 3));
		rationals.add(new Rational(2));
		System.out.println(rationals);
		
		rationals.sort(null);
		System.out.println(rationals);

		Collections.reverse(rationals);
		System.out.println(rationals);

	}

}
