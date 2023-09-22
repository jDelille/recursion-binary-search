

public class BinarySearchRecursion {
	private static final int[] array = {1,2,3,4,5,6,7,8,9,10,20,30,34,36,50,100,8787,100_000_000};
	
	
	public static void main(String args[]) {
		int target = 10;

		int result = binarySearch(array, target, 0, array.length);
		
		System.out.println("Result: " + result);
		
		
	}
	
	public static int binarySearch(int[] array, int target, int low, int high) {
		
		if(low > high) {
			return -1;
		}
		
		int mid = (low + high) / 2;
		
		if(target == array[mid]) {
			return mid;
		} else if (target < array[mid]) {
			return binarySearch(array, target, low, mid - 1);
		} else {
			return binarySearch(array, target, mid, high - 1);
		}
	}
	
	
}
