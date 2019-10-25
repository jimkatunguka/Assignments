package example3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class wordCount {
	
public static void main(String[]args) {
	//Set<String> engListStopWords = null;
	//find top k English words
	
	List<String>names = Arrays.asList("Kats", "Jim", "Sentongo", "Ntongo", "Jim");
	
	
	Function <List<String>, Map<String, Long>> count = l->
	l.stream().flatMap(s-> Arrays.stream(s.split(" "))).collect(
			Collectors.groupingBy(
			Function.identity(), Collectors.counting())
			);
	
	System.out.println(count.apply(names));
	
	}
}

