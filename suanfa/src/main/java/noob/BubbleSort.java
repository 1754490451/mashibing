package noob;

/**
 * 冒泡排序(将值移动到正确的下标位置)
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {7,3,6,12,6,8,4,2};
		printArray(arr);
		sort(arr);
		printArray(arr);
	}

	public static void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void sort(int[] arr){
		int max = 2;
		if (arr == null || arr.length < max) {
			return;
		}
		// 0 ~ n-1
		// 0 ~ n-2
		// 0 ~ n-3
		int n = arr.length;
		for (int end = n - 1; end >=0; end --){
			// 0 ~ end 之间进行比较
			// 0 1  1 2  2 3  . .  end-1 end
			for (int second = 1; second <= end ; second++) {
				if (arr[second-1] > arr[second]){
					swap(arr,second,second-1);
				}
			}
		}
	}

	public static void swap(int[] arr,int i, int j){
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
