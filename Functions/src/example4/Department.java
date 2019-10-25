package example4;

import java.util.ArrayList;
import java.util.List;

public class Department{
	
	List<Role>roles = new ArrayList<>();

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
}