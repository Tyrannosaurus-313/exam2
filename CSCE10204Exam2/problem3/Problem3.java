package problem3;

public class Problem3 {

	public static void main(String[] args) {
		String str = "This is a test";
		char delim = 's';
		String[] tokens;
		
		tokens = split(str,delim);
		showArray(tokens);
	}
	
	public static void showArray(String[] array) {
		int index;
		
		System.out.printf("[");
		for(index=0;index<array.length;index++) {
			if(index!=0) {
				System.out.printf(",");
			}
			System.out.printf("%s", array[index]);
		}
		System.out.printf("]\n");
	}
	
	public static String[] split(String str, char delim) {
		String[] splitStrs = new String[str.length()];
		String currStr = "";
		int count = 0;
		int i;
		for (i = 0; i < str.length() - 1; i++) {
			char currChar = str.charAt(i);
			if (currChar != delim) {
				currStr += currChar;
				continue;
			}
			splitStrs[count] = currStr;
			currStr = "";
			count++;			
		}
		currStr += str.charAt(i);
		splitStrs[count] = currStr;
		count++;
		
		String[] finSplit = new String[count];
		for (i = 0; i < count; i++) {
			finSplit[i] = splitStrs[i];
		}			
		return finSplit;
	}
}
