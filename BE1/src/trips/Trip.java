package trips;

import java.util.ArrayList;



public class Trip{

    private ArrayList<Flight> flights;

    public Trip(){
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight0){
        flights.add(flight0);
    }

    public String toString(){
        if (this.flights.size() == 0) {
            return("No flight yet");
        }

        if (this.flights.size() == 1) {
            Flight flight = this.flights.get(0);
            Airport departureAirport = flight.getDepartureAirport();
            Airport arrivalAirport = flight.getArrivalAirport();
            String String = "\"";
            String += departureAirport.getIata();
            String += " ";
            String += "-";
            String += " ";
            String += arrivalAirport.getIata();
            String += " (direct)\"";
            return(String);
        }

        else {
            int n = flights.size();
            String String = "\"";
            Flight first_flight = this.flights.get(0);
            Flight last_flight = this.flights.get(n-1);
            Airport departureAirport = first_flight.getDepartureAirport();
            Airport arrivalAirport = last_flight.getArrivalAirport();
            String += departureAirport.getIata();
            String += " ";
            String += "-";
            String += " ";
            String += arrivalAirport.getIata();
            String += " (";
            String += n;
            String += " flights)\"";
            return(String);

        }
    }

    public boolean isValid() {
        if (this.flights.size() == 0) {
            return(false);
        }
        if (this.flights.size() == 1) {
            return(true);
        }
        else {
            int n = this.flights.size();
            for (int i = 0; i < n; i++) {
                if (i < n-1 && this.flights.get(i).getArrivalAirport() != this.flights.get(i+1).getDepartureAirport()) {
                    return(false);
                }
                if (i == n-1) {
                    return(this.flights.get(i-1).getArrivalAirport() == this.flights.get(i).getDepartureAirport());
                }
            
            }
            return(true);

        }
    }
}

