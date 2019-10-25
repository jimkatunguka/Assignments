package lesson9_2.labs.prob12;

@FunctionalInterface
public interface TriFunction<S,T,U, R> {
	R apply(S s, T t, U u);
}
