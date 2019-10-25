package testing;

public class JUnitTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//returns square of an integer.
	public int square(int x) {
		return x*x;
	}
	
	public int countA (String word) {
		int count = 0;
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)=='a' || word.charAt(i)=='A') {
				count++;
			}
		}
		return count;
	}

}
