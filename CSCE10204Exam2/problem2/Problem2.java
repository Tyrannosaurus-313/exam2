package problem2;

public class Problem2 {

	public static void main(String[] args) {
		int[] array1 = {1,1,1,1,1};
		int[] array2 = {2,2,2,2,2};
		int[] result;
		
		result = interleave(array1,array2);
		showArray(result);
		

	}
	public static void showArray(int[] array) {
		int index;
		
		System.out.printf("[");
		for(index=0;index<array.length;index++) {
			if(index!=0) {
				System.out.printf(",");
			}
			System.out.printf("%d", array[index]);
		}
		System.out.printf("]\n");
	}
	
	public static int[] interleave(int[] array1, int[] array2) {
		int i = 0;
		int[] result = new int[array1.length * 2];
		for (; i < array1.length; i++) {
			result[i * 2] = array1[i];
			result[i * 2 + 1] = array2[i];
		}
		return result;
	}
}
