package trips;


public class TripMain{
    public static void main(String[] args) {
        Airport airport1 = new Airport("Toulouse Blagnac", "TLS");
        Airport airport2 = new Airport("Roissy Charles de Gaulle", "CDG");
        Airport airport3 = new Airport("Reykjavik", "RKV");
        String String_a = airport1.toString();
        
        System.out.println(String_a);

        Flight flight1 = new Flight("AF1234", airport1, airport2);
        Flight flight2 = new Flight("AF5678", airport2, airport3);
        String String_f = flight1.toString();
        
        System.out.println(String_f);

        Trip trip = new Trip();
        trip.addFlight(flight1);
        trip.addFlight(flight2);

        String String_t = trip.toString();
        System.out.println(String_t);

        
    }
    

}