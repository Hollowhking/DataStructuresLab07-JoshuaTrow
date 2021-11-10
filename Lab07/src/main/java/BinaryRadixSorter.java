import java.util.*;

public class BinaryRadixSorter {

	public static List<String> sort(int numDigits, List<String> numbers) {
		for (int i=0; i<numDigits;i++) {
			numbers = sortDigit(i,numbers);
		}
		return numbers;
	}
	
	public static List<String> sortDigit(int numDigits, List<String> numbers) {
		Buckets buckets = new Buckets();
		for(String temp: numbers) {
			if (temp.charAt(numDigits)=='0') {
				buckets.addZero(temp);
			}
			else if (temp.charAt(numDigits)=='1') {
				buckets.addOne(temp);
			}
			}
		return buckets.getAllInOrder();
	}
    
	public static String toString(List<String> numbers) {
		String output;
		output = "[ ";
		for (String temp : numbers) {
			output += temp+ " ";
		}
		output += "]";
		return output;
	}
}
