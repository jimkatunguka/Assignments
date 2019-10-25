package april2017;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

class EmployeeAdminTest {
	List<String> ssns = Arrays.asList("234121244", 
            "113145657",
            "342892138",
            "999234124",
            "523421589",
            "234112355",
            "553667742",
            "212341557",
            "115513151");

HashMap<String, Employee> h = new HashMap<String, Employee>() {
{
put("523421589", new Employee("Tom", 88000, "523421589"));
put("234121244", new Employee("Bob", 78000, "234121244"));
put("212341557", new Employee("Hank", 110000, "212341557"));
put("999234124",new Employee("Ephraim", 66000, "999234124"));
put("432346624",new Employee("Dogface", 54000, "432346624"));
put("115513151",new Employee("Jonas", 76000, "115513151"));
put("113145657",new Employee("Rick", 92000, "113145657"));
put("678316579",new Employee("Yonas", 82000, "678316579"));
put("342892138",new Employee("Ibu", 100000, "342892138"));

}
};

	@Test
	void prepareSsnReporttest() {
		
List<String> expected = Arrays.asList("432346624", "678316579");
List<String> actual = EmployeeAdmin.prepareSsnReport(h, ssns);
		assertEquals(expected, actual);
	}
	
	@Test
	void prepareEmpReporttest() {
		Employee e1 = new Employee("Hank", 110000, "212341557");
		Employee e2 = new Employee("Ibu", 100000, "342892138");
		Employee e3 = new Employee("Rick", 92000, "113145657");
		Employee e4 = new Employee("Tom", 88000, "523421589");
		
List<Employee> expected = Arrays.asList(e1, e2, e3, e4);
List<Employee> actual = EmployeeAdmin.prepareEmpReport(h, ssns);
		assertEquals(expected, actual);
	}

}
