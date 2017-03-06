/**
 * 算法第四版堆排序
 * @author yang
 *
 */
public class HeapSort {
	private static void exch(Comparable[] a, int i, int j){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	/**
	 * 比较数组a第j和第k个元素大小
	 * @param a
	 * @param j
	 * @param k
	 * @return
	 */
	private static boolean less(Comparable[] a, int j, int k){
		return a[j].compareTo(a[k]) < 0;
	}
	/**
	 * 下沉a数组第k个节点
	 * @param a
	 * @param k
	 * @param N
	 */
	private static void sink(Comparable[] a, int k, int N) {
		while (2*k <= N) {
			int j = 2*k;
			if (j < N && less(a, j, j+1)) {
				j ++;
			}
			if (!less(a, k, j)) {
				break;
			}
			exch(a, k, j);
			k = j;
		}
	}
	private static void sort(Comparable[] a) {
		//构造堆
		int N = a.length - 1;
		for (int k = N/2; k >=1; k--) {
			sink(a, k, N);
		}
		System.out.println("before");
		for (Comparable t:a) {
			System.out.printf("%s ", t);
		}
		System.out.printf("\n");
		//下沉排序
		while (N >1) {
			exch(a, 1, N--);
			sink(a, 1, N);
		}
		System.out.println("after");
		for (Comparable t:a) {
			System.out.printf("%s ", t);
		}
	}
	
	public static void main(String[] args) {
		//依照书上第一个元素为空的假设
		String[] a = {"","s","o","r","t","e","x","a","m","p","l","e"};
		sort(a);
	}
}
