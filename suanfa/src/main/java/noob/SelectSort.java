package noob;


/**
 * 选择排序(选择出最小值的下标)
 * <p>
 * 思路：
 * 1、定义一个最小值的下标
 * 2、先从1~n的下标范围中找出最小值的下标，然后和假设下标的值互换。。。。
 * 3、再从2~n的下标范围中找出最小值的下标，然后和假设下标的值互换。。。。
 * 4、重复上述步骤直到所有下标都比较完成
 */
public class SelectSort {

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

	public static void sort(int[] source) {
		int max = 2;
		if (source == null || source.length < max) {
			return;
		}
		int n = source.length;
		for (int i = 0; i < n; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				minIndex = source[j] < source[minIndex] ? j : minIndex;
			}
			swap(source, i, minIndex);
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}


}
