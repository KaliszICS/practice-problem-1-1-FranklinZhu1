public class PracticeProblem {

	public static int sum2D(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[i].length; ++j) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

	public static int sumRow(int[][] arr, int row) {
		int sum = 0;
		for (int i = 0; i < arr[row].length; ++i) sum += arr[row][i];
		return sum;
	}

	public static int sumColumn(int[][] arr, int column) {
		int sum = 0;
		for (int i = 0; i < arr.length; ++i) sum += arr[i][column];
		return sum;
	}
}
