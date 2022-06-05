package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		int gameScore = 150;
		int lastScore = ++gameScore; // gameScore += 1; gameScore = gameScore + 1;
		System.out.println(gameScore);
		System.out.println(lastScore);
		
		int gameScore2 = 150;
		int lastScore2 = gameScore2++;
		System.out.println(gameScore2);
		System.out.println(lastScore2);
	}

}
