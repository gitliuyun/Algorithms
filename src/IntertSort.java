/**
 * 插入排序
 * @author yang
 *
 */
public class IntertSort extends Template{
	@Override
	protected void sort(Comparable[] a) {
			int N = a.length;
			for (int i = 1; i < N; i++) {
				for (int j = i; j > 0 && less(a[j], a[j - 1]); j --) {
					exch(a, j, j - 1);
				}
			}
	}
}
