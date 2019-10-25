package lesson9_2.labs.prob11b;

@FunctionalInterface
public interface QuadFunction<S,T,U, V, R> {
	R apply(S s, T t, U u, V v);
}
