package BubbleSort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] nums = new int[] { 12, 32, 96, 151, 75, 85, 45, 69, 18, 95, 35 };

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
				if (nums[j] > nums[j + 1]) {
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
