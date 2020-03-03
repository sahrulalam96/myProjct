package hacktiv8;

public class meanMode {
	public static void main(String[] args) {

		int value[] = { 5, 3, 3, 3, 1 };

		for (int i = 0; i < value.length; i++) {
			for (int j = i + 1; j < value.length; i++) {
				if (value[i] == value[j]) {
					System.out.println("Nilai ganda : " + value[i]);
				}
			}
		}
	}

}
