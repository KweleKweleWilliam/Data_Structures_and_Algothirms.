package BubbleSort2;

public class BubleSortRetry {

	public static void main(String[] args) {
		int[] nums = new int[] { 74, 41, 52, 63, 96, 85, 74, 78, 96, 6, 4, 75, 9, 65, 45, 8 };

		bubbleSort(nums);

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

	public static void bubbleSort(int[] nums) {

		boolean swapped;
		for (int i = 0; i < nums.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[1 + j]) {

					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					swapped = true;

				}
			}
			if (swapped == false) {

				break;
			}
		}

	}

}
