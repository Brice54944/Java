package trips;

public class Airport{

    private String name;
    private String iata;

    public Airport(String name0, String iata0) {
        this.name = name0;
        this.iata = iata0;
    }

    public String getName(){
        return(this.name);
    }

    public String getIata(){
        return(this.iata);
    }

    public String toString(){
        String String = "\"";
        String += this.getName();
        String += " ";
        String += "(";
        String += this.getIata();
        String += ")";
        String += "\"";
        return(String);
    }

    public boolean isSameAs(Airport other) {
        return(this.iata == other.iata);
    }

    
}