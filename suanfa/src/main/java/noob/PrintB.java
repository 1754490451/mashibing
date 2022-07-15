package noob;

/**
 * 输出一个数的32位
 * int类型的最大值是2^31 -1
 * int类型的最小值是-2^31
 * 二进制中符号位占最高位，0表示正1表示负
 * 负数的二进制解读成十进制时，要先在二进制的基础上取反加1再解读成十进制
 * <p>
 * 位运算：
 * &(与) 11为1
 * |(或) 有1为1
 * ^(异或) 相同为0不同为1
 * ~(取反) 1变0 0变1  ~后+1等同于相反数
 * <<(左移)
 * >>(带符号右移)
 * >>>(不带符号右移)
 *
 * @author wcy
 */
public class PrintB {


	public static void print(int num) {
		int index = 31;
		for (int i = index; i >= 0; i--) {
			System.out.print((num & (1 << i)) == 0 ? "0" : "1");
		}
		System.out.println();
	}


	public static Double factorial2(double result, int start, int end) {
		for (int i = start; i <= end; i++) {
			result += Math.pow(2, i);
		}
		return result;
	}

	public static void main(String[] args) {
		//int num = 4;
		//int maxValue = Integer.MAX_VALUE;
		//int minValue = Integer.MIN_VALUE;
		//System.out.println(minValue);
		//print(-5);


		//Double aDouble = factorial2(0, 0, 30);
		//System.out.println(aDouble);
		//long i1 = aDouble.longValue();
		//System.out.println(i1);
		//System.out.println((long)Math.pow(2,31)-1);


		//int minValue = Integer.MIN_VALUE;
		//print(-1);
		//System.out.println("");
		//// 带符号右移动(符号位补新位置)
		//print(-1 >> 1);
		//System.out.println("");
		//// 不带符号右移(0补新位置)
		//print(-1 >>> 1);
		//System.out.println("");
		//System.out.println(1>>1);


		int a = 1;
		int b = -a;
		b = ~a + 1;
		System.out.println(a);
		System.out.println(b);
		print(2);
		print(-2);

	}

}
