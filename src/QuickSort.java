/**
 * 快速排序
 * @author yang
 *
 */
public class QuickSort extends Template{
	protected void sort(Comparable[] a) {
		sort(a, 0, a.length -1);
	}
	private static void sort(Comparable[] a, int low, int high) {
		if (low >= high) {
			return;
		}
		int pivot = partition(a, low, high);
		sort(a, low, pivot - 1);
		sort(a, pivot + 1, high);
	}
	
	private static int partition(Comparable[]a, int low, int high){
		int i = low, j = high + 1;
		Comparable pivot = a[low];
		while (true) {
			while(less(a[++i], pivot)){
				if (i == high) {
					break;
				}
			}
			while (less(pivot, a[--j])) {
				if (j == low) {
					break;
				}
			}
			if (i >=j){
				break;
			}
			exch(a, i, j);
		}
		exch(a, low, j);
		return j;
	}
}
