package printDuplicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class printDuplicates {
	
	static List<String> numbers = Arrays.asList("one", "two", "three", "one", "three", "one", "five");
	static List<List<Object>> list = Arrays.asList(Arrays.asList("one", "two", "three", "one", "three", "one", "five"),
								Arrays.asList(8,12,67,19,229), Arrays.asList(true, false, true));
	
	public static void main(String[] args) {
	 System.out.println(returnDuplicates(numbers));
	 System.out.println(list.stream().flatMap(m-> m.stream()).collect(Collectors.toList()));
	}
	
	public static String returnDuplicates (List<String> list ){
		return list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.filter(e->e.getValue()>1)
				.map(e->e.getKey())
				.collect(Collectors.joining(","));
	}

}
