package example4;

import java.util.ArrayList;
import java.util.List;

public class University{
	List<Department>depts = new ArrayList<>();

	public List<Department> getDepts() {
		return depts;
	}

	public void setDepts(List<Department> depts) {
		this.depts = depts;
	}
	
}