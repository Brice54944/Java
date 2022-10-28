package airlines;

import java.util.ArrayList;

public class TravelAgency {

   private String name;
   private ArrayList<Airline> suppliers;

   public TravelAgency(String name) {
      this.name = name;
      this.suppliers = new ArrayList<>();

   }

   public void addAirline(Airline airline) {
      this.suppliers.add(airline);
   }

   public Airline getAirlineByIata(String iata) {
      // TODO: modify line below
      return null;
   }

   public void display() {
      System.out.println(this.name);
      System.out.println("Suppliers:");
      // TODO: complete here
   }
}
