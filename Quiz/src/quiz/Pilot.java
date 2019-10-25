package quiz;

import java.util.List;

public class Pilot implements Role{
Role pilot;
List<Flight>pilotFlights;
	@Override
	public Role getRole() {
		return pilot;
	}
	public List<Flight> getPilotFlights() {
		return pilotFlights;
	}
	public void setPilotFlights(List<Flight> pilotFlights) {
		this.pilotFlights = pilotFlights;
	}
	
	
}
