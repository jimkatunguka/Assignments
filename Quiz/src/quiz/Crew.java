package quiz;

public class Crew implements Role{
Role crew;

@Override
public Role getRole() {
	return crew;
}
}
