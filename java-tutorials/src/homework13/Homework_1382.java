package homework13;

public class Homework_1382 {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 6; j++) {
				if (j != 5) {
					System.out.printf("%d x %d = %2d\t", j, i, j * i);
				} else {
					System.out.printf("%d x %d = %2d", j, i, j * i);
				}
			}
			System.out.println();
		}

	}

}
