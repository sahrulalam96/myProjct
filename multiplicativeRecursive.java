package hacktiv8;

public class multiplicativeRecursive {
	
	public static int recursive(int n) {
		if (n==0) {
			return 1;
		}
		return n * recursive(n-1);
	}

	public static void main(String[] args) {
		
		System.out.println(recursive(10));	
			
	}
}
