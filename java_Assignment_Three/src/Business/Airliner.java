
package Business;

import java.util.ArrayList;

public class Airliner 
{
    private String name;
    private String address;
    private int number_Of_flights;
    
    private ArrayList<Flight> flight;
    
    public Airliner()
    {
        flight = new ArrayList<Flight>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber_Of_flights() {
        return number_Of_flights;
    }

    public void setNumber_Of_flights(int number_Of_flights) {
        this.number_Of_flights = number_Of_flights;
    }

    public ArrayList<Flight> getFlight() {
        return flight;
    }

    public void setFlight(ArrayList<Flight> flight) {
        this.flight = flight;
    }
    @Override
    public String toString() {
        return this.getName(); 
    }
    public Flight addFlight(){
        //Flight newFlight = new Flight(2,2,2);
        Flight newFlight = new Flight();
        flight.add(newFlight);
        return newFlight;
       
    }
    public void Remove(Flight f)
    {
        flight.remove(f);
    }
    
    
}
