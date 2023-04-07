package arrays;

public class segregatezeros {

	//program to segregate zeros and numbers in-place
	// 0000 5631
	public static void main(String args[]) {

		Integer arr[] = new Integer[] { 1, 0, 0, 3, 0, 5, 0, 7, 8 };

		segreggate(arr);
		for (int i : arr) {
			System.out.print(i);
		}

	}

	private static Integer[] segreggate(Integer[] arr) {

		int len = arr.length;
		int m = 0;
		int n = len - 1;

		for (int i = 0; i < len; i++) {
			if (m < n) {
				if (arr[m] != 0 && arr[n] == 0) {
					int temp = arr[m];
					arr[m] = arr[n];
					arr[n] = temp;
					n--;
					m++;
				} else if (arr[m] != 0 && arr[n] != 0) {
					n--;
				} else if (arr[m] == 0 && arr[n] == 0) {
					m++;
				} else if (arr[m] == 0 && arr[n] != 0) {
					n--;
					m++;
				}

			}

		}
		return arr;

	}
}
