package trips;


public class Flight{

    private String flightNumber;
    private Airport departureAirport;
    private Airport arrivalAirport;

    public Flight(String num0, Airport depAirport0, Airport arrAirport0){
        this.flightNumber = num0;
        this.departureAirport = depAirport0;
        this.arrivalAirport = arrAirport0;
    }

    public String getFlightNumber(){
        return(this.flightNumber);
    }

    public Airport getDepartureAirport(){
        return(this.departureAirport);
    }

    public Airport getArrivalAirport(){
        return(this.arrivalAirport);
    }

    public String toString(){
        String String = "\"";
        String += this.getFlightNumber();
        String += " ";
        String += this.getDepartureAirport().getIata();
        String += " ";
        String += "-";
        String += " ";
        String += this.getArrivalAirport().getIata();
        String += "\"";
        return(String);

    }

    public boolean isConnectedTo(Flight next) {
        return(this.arrivalAirport == next.departureAirport);
    }

    
}