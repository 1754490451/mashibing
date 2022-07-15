package noob;

/**
 * 插入排序
 * 0 ~ 0 排序
 * 0 ~ 1 排序
 * 0 ~ 2 排序
 * 0 ~ n-1 排序
 */
public class InsertSort {

	public static void main(String[] args) {
		int[] arr = {7, 3, 6, 12, 6, 8, 4, 2};
		printArray(arr);
		sort(arr);
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void sort(int[] arr) {
		int max = 2;
		if (arr == null || arr.length < max) {
			return;
		}
		// 0 ~ 0 已完成的
		// 0 ~ 1
		// 0 ~ 2
		// 0 ~ 3
		// 0 ~ n-1

		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int newDataIndex = i;
			while (newDataIndex - 1 >= 0 && arr[newDataIndex - 1] > arr[newDataIndex]){
				swap(arr,newDataIndex,newDataIndex - 1);
				newDataIndex --;
			}
		}


	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

}
