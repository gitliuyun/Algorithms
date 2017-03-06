public class TestSort {
	public static void main(String[] args) {
		//依照书上第一个元素为空的假设
		String[] a = {"","s","o","r","t","e","x","a","m","p","l","e"};
		/*new IntertSort().sort(a);
		new ShellSort().sort(a);*/
		new MergeSort().sort(a);
		for (Comparable t:a) {
			System.out.print(t + " ");
		}
	}
}
