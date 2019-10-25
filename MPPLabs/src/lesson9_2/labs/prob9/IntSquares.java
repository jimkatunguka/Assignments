package lesson9_2.labs.prob9;

import java.util.Collections;
import java.util.stream.IntStream;

public class IntSquares {

	public static void main(String[] args) {
		printSquares(10);

	}
	public static void printSquares(int num) {
		IntStream.iterate(1, v->v+1)
		.limit(num)
		.map(m->m*m)
		.forEach(m->System.out.print(m + ", "));
	}
}
