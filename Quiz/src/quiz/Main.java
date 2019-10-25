package quiz;

import java.util.List;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		

	}
	static QuadFunction<List<Person>, Integer, Integer, Integer, Double> calcTotalFare = (list, minAge, maxAge, year)->
		list.stream()
		.filter(l->l.getAge()<minAge && l.getAge()>maxAge)
		.flatMap(l->l.getRoles().stream())
		.filter(r-> r instanceof Passenger)
		.map(r-> (Passenger)r)
		.flatMap(r->r.getPassengerFlights().stream())
		.filter(r->r.getSchDep().getYear()==year)
		.mapToDouble(r->r.getFare()).sum();
		
		//CalcFlightDelay
		
		
	//calcTotalFare(List<Person>, int minAge, int maxAge, int year) :: Double
	//worstKAirlines(List<Person>, int k)::List<Airline>

//	BiFunction<List<Person>, Integer, List<Airline>> worstKAirlines = (list, k) ->
//	list.stream()
//	.flatMap(l->l.getRoles().stream())
//	.filter(r->r instanceof Passenger)
//	.map(r-> (Passenger) r)
//	.

}
