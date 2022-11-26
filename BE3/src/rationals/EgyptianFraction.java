package rationals;


import java.util.TreeMap;
public class EgyptianFraction {
    private TreeMap<Rational, Integer> unitFractions;

    public EgyptianFraction() {
        this.unitFractions =new TreeMap<>();
    }

    public void addUnitFraction(int denom) {
        Rational fractionUnit = new Rational(1, denom);
        this.unitFractions.put(fractionUnit, denom);
    }



    public TreeMap<Rational, Integer> getUnitFractions() {
        return this.unitFractions;
    }

    public void setUnitFractions(TreeMap<Rational, Integer> unitFractions) {
        this.unitFractions = unitFractions;
    }
    


   
    @Override
    public String toString() {
        String string = "";
       // string += this.unitFractions.firstEntry().getKey()+ " " + "+";
        for (Rational rational : this.unitFractions.keySet())
        //for (int i = 1; i < this.unitFractions.size()-1; i++){
            string += " " + rational.toString() + " " + "+";
            //}
        //string += " " + this.unitFractions.get(this.unitFractions.size()-1).toString();
        return string;

    }

}
