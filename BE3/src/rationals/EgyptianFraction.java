package rationals;

import java.util.ArrayList;
public class EgyptianFraction {
    private ArrayList<Rational> unitFractions;

    public EgyptianFraction() {
        this.unitFractions = new ArrayList<>();
    }

    public void addUnitFraction(int denom) {
        Rational fractionUnit = new Rational(1, denom);
        this.unitFractions.add(fractionUnit);
    }



    public ArrayList<Rational> getUnitFractions() {
        return this.unitFractions;
    }

    public void setUnitFractions(ArrayList<Rational> unitFractions) {
        this.unitFractions = unitFractions;
    }
    


   
    @Override
    public String toString() {
        String string = "";
        string += this.unitFractions.get(0).toString()+ " " + "+";
        for (int i = 1; i < this.unitFractions.size()-1; i++){
            string += " " + this.unitFractions.get(i).toString() + " " + "+";
            }
        string += " " + this.unitFractions.get(this.unitFractions.size()-1).toString();
        return string;

    }

}
