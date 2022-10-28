package trips;

public class ValidationMain {
    public static void main(String[] args) {
        Airport airport1 = new Airport("Toulouse Blagnac", "TLS");
        Airport airport2 = new Airport("Roissy Charles de Gaulle", "CDG");
        Airport airport3 = new Airport("Reykjavik", "RKV");
        boolean b0 = airport1.isSameAs(airport1);
        boolean b1 = airport2.isSameAs(airport3);
        
        System.out.println(b0);
        System.out.println(b1);

        Flight flight1 = new Flight("AF1234", airport1, airport2);
        Flight flight2 = new Flight("AF5678", airport2, airport3);
        Flight flight3 = new Flight("AF7891", airport2, airport2);
        
        boolean b3 = flight1.isConnectedTo(flight1);
        boolean b4 = flight1.isConnectedTo(flight2);

        System.out.println(b3);
        System.out.println(b4);

        Trip trip = new Trip();
        trip.addFlight(flight1);
        trip.addFlight(flight2);
        trip.addFlight(flight3);

        boolean b5 = trip.isValid();

        System.out.println(b5);



    }
}
