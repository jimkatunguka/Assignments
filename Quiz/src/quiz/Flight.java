package quiz;

import java.time.LocalDate;

public class Flight {
	double fare;
	Pilot pilot;
	Passenger passenger;
	Airline airline;
	
	LocalDate schDep;
	LocalDate schArr;
	
	LocalDate actDep;
	LocalDate actArr;
	
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public Pilot getPilot() {
		return pilot;
	}
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	public LocalDate getSchDep() {
		return schDep;
	}
	public void setSchDep(LocalDate schDep) {
		this.schDep = schDep;
	}
	public LocalDate getSchArr() {
		return schArr;
	}
	public void setSchArr(LocalDate schArr) {
		this.schArr = schArr;
	}
	public LocalDate getActDep() {
		return actDep;
	}
	public void setActDep(LocalDate actDep) {
		this.actDep = actDep;
	}
	public LocalDate getActArr() {
		return actArr;
	}
	public void setActArr(LocalDate actArr) {
		this.actArr = actArr;
	}
	
	
}
