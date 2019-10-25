package may2017;

import java.util.*;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();

		//implement
		for(LibraryMember lm : members) {
			
			CheckoutRecord cr = lm.getCheckoutRecord();
			List<CheckoutRecordEntry>list = cr.getCheckoutEntryList();
			
			for(CheckoutRecordEntry cre: list) {
			if(item .equals (cre.getLendingItem())){
				phoneNums.add(lm.getPhone());
				}
			}
		}
		Collections.sort(phoneNums);
		return phoneNums;
	}
}
