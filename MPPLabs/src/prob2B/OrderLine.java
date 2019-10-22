package prob2B;

public class OrderLine {
	private int lineNum;
	private int price;
	private int qty;
	private Order ord;
	
	OrderLine(int lineNum,int qty, int price, Order ord){
		this.lineNum = lineNum;
		this.price = price;
		this.qty = qty;
		this.ord = ord;
	}

	public int getLineNum() {
		return lineNum;
	}

	public void setLineNum(int lineNum) {
		this.lineNum = lineNum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return qty;
	}

	public void setQuantity(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return lineNum + " "+ qty + " "+price;
	}
}
