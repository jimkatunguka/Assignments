package april2017;

public class Admin {
	Department [] depts;
	String s;
	//implement
	public Admin(Department [] depts) {
		this.depts = depts;
	}
	
	public String hourlyCompanyMessage() {
		String line = "";
		for(Department d : depts) {
			line += format(d.getName(), d.nextMessage());
		}
		return line;
	}
	
	
	public String format(String name, String msg) {		
		return name + ": " + msg+"\n";
	}
}
