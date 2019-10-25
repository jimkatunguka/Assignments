package example1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import example3.TernaryFunction;

public class wordCount {

	public static void main(String[] args) throws IOException {
		
		Set<String> stops = Files.lines(Paths.get("stops.txt")).collect(Collectors.toSet());
		List<String> names = Arrays.asList("Andrew", "Gilbert", "and", "Jim", "Julius", "Andrew", "Gilbert", "and", "shift", "go", "cannot", "behind", "underline", "Gilbert");
		
		System.out.println(findTopkWords.apply(names, stops, 5));
	}
	
	static TernaryFunction<List<String>, Set<String>, Integer, List<String>> findTopkWords = (lines, stopWord, k) -> lines
			.stream().flatMap(s -> Arrays.stream(s.split(" ")))
			.filter(m -> !stopWord.contains(m))
			.collect(Collectors.groupingBy(e -> e))
			.entrySet().stream()
			.map(e -> {
				Map<String, Integer> w = new HashMap<>();
				w.put(e.getKey(), e.getValue().size());
				return w;
			})
			.flatMap(m -> m.entrySet().stream()).sorted((e1, e2) -> e2.getValue() - e1.getValue()).limit(k)
			.map(z -> z.getKey())
			.collect(Collectors.toList());
	

	
	
}
