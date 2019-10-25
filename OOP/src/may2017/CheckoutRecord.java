package may2017;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	private List<CheckoutRecordEntry> list = new ArrayList<>();
	
	public List getCheckoutEntryList() {
		return list;
	}
	
	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		list.add(entry);
	}	
}
