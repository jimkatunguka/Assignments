package quiz;

	@FunctionalInterface
	public interface QuadFunction<S,T,R,V, U>{
		U apply(S s, T t, R r, V v);
	}

