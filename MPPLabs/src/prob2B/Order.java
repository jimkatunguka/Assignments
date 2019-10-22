package prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Order {
	private int orderNum;
	private List<OrderLine> ordLines;
	private LocalDate ordDate;
	
	public Order(LocalDate ordDate, int lineNum,int qty, int price){
		this.orderNum = setOrderNum(); 
		this.ordDate = ordDate;
		ordLines = new ArrayList<>();
		ordLines.add(new OrderLine(lineNum, qty, price, this));
		
	}
	
	public int setOrderNum() {
		Random rand = new Random();
		int Num = rand.nextInt(12000000 - 5) + 450000;
		return Num;
	}
	
	public void addOrdLine(int lineNum, int qty, int price) {
		this.ordLines.add(new OrderLine(lineNum, qty, price, this));
	}
	
	public List<OrderLine> getOrdLines(){
		return this.ordLines;
	}
	
	@Override
	public String toString() {
		return "priceOrderNumber:"+this.orderNum+" orderDate:"+this.ordDate+" OrderLine:"+Arrays.asList(ordLines);
	}
	
}
