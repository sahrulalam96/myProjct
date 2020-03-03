package hacktiv8;

public class minMax {

	public static int minValue(int[] number) {

		int min = number[0];

		for (int i = 0; i < number.length; i++) {
			if (number[i] < min) {
				min = number[i];
			}
		}
		return min;
	}

	public static int maxValue(int[] number) {
		int max = number[0];

		for (int i = 0; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int number[] = {9,5,6,3,1,4,4,8,0};
		
			System.out.println("Minimum value : "+minValue(number));
			System.out.println("Maximum value : "+maxValue(number));
		
	}
}