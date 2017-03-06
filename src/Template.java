/**
 * 排序的模板
 * @author yang
 *
 */
public abstract class Template {
	protected abstract void sort(Comparable[] a);
	/**
	 * 比较大小
	 * @param v
	 * @param w
	 * @return
	 */
	protected static boolean less(Comparable v, Comparable w){
		return v.compareTo(w) < 0;
	}
	/**
	 * 交换数组下标为i和j的元素
	 * @param a
	 * @param i
	 * @param j
	 */
	protected static void exch(Comparable[] a, int i, int j){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	protected static boolean isSorted(Comparable[] a){
		for (int i = 1; i < a.length; i ++) {
			if (less(a[i], a[i - 1])) {
				return false;
			}
		}
		return true;
	}
}
