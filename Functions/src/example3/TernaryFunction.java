package example3;
@FunctionalInterface
public interface TernaryFunction<A, B, C, D> {

D apply(A x, B y, C z);
	

}
