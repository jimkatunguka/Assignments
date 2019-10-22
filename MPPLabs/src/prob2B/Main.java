package prob2B;

import java.time.LocalDate;

import prob2B.Order;

public class Main {

	public static void main(String[] args) {
		
		Order ord = new Order(LocalDate.now(), 10, 2, 1200);
		System.out.println(ord);
		
		ord.addOrdLine(7, 3, 1500);
		System.out.println(ord);
		
		System.out.println(ord.getOrdLines());
	}

}
