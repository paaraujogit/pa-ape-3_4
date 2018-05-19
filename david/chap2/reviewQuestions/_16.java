package david.chap2.reviewQuestions;

public class _16 {

	public static void main(String[] args) {

		do {
			int y = 1;
			System.out.print(y++ + " ");
		} while(y <= 10);	//y out of the scope - Doesn't compile!!

	}

}
