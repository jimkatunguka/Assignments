package quiz;

import java.util.List;

public class Passenger implements Role{
	Role passenger;
	List<Flight>passengerFlights;

	@Override
	public Role getRole() {
		return passenger;
	}

	public List<Flight> getPassengerFlights() {
		return passengerFlights;
	}

	public void setPassengerFlights(List<Flight> passengerFlights) {
		this.passengerFlights = passengerFlights;
	}
	
	

}
