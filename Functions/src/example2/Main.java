package example2;

public class Main {
	

	public static void main(String[] args) {
		
		Ternary<Integer, Integer,Integer,Integer> ternary = (x,y,z) ->{
			return (int) (Math.pow(x,2) + Math.pow(y, 2) + Math.pow(z, 2));
		};
		
		
				System.out.println(ternary.squareAdd(2, 4, 5));
	}

	

}
