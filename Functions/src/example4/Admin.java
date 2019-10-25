package example4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Admin{
	
	public List<Course> getMostPopularCourses (University u, int k){
		return u.getDepts().stream()
				.flatMap(d->d.getRoles().stream())
				.filter(r->r instanceof Professor )
				.map(r-> (Professor)r)
				.flatMap(r->r.getGrades().stream())
				.flatMap(r->r.getCourses().stream())
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.sorted((e1,e2)->(int)(e1.getValue() - e2.getValue()))
				.map(e->e.getKey())
				.limit(k)
				.collect(Collectors.toList());			
	}
	
	public Professor getTopRatedProfessor(University u) {
		return u.getDepts().stream()
				.flatMap(d->d.getRoles().stream())
				.filter(r->r instanceof Professor)
				.map(r-> (Professor)r)
				.max((p1,p2)->(int)(avgRate.apply(p1) - avgRate.apply(p2)))
				.get();
	}
	
	Function<Professor, Double> avgRate = p ->
	p.getGrades().stream()
	.mapToInt(g-> g.getRating()).average()
	.getAsDouble();
}