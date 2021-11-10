//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//
//import java.util.*;
//
//public class TestRadixSort {
//	@Test
//	public void testSort1() {
//		// Test #1
//        String[] origNumbers = { "0011", "1001", "1000", "0111", "0101" };
//        List<String> input = new ArrayList<String>(Arrays.asList(origNumbers));
//
//        assertEquals(BinaryRadixSorter.toString(input), "[ 0011 1001 1000 0111 0101 ]");
//
//        List<String> output = BinaryRadixSorter.sort(4, input);
//        assertEquals(BinaryRadixSorter.toString(output), "[ 0011 0101 0111 1000 1001 ]");
//	}
//
//	@Test
//	public void testSort2() {
//		// Test #2
//        String[] origNumbers = { "111", "101", "011", "110", "001", "000", "010" };
//        List<String> input = new ArrayList<String>(Arrays.asList(origNumbers));
//
//        assertEquals(BinaryRadixSorter.toString(input), "[ 111 101 011 110 001 000 010 ]");
//
//        List<String> output = BinaryRadixSorter.sort(3, input);
//        assertEquals(BinaryRadixSorter.toString(output), "[ 000 001 010 011 101 110 111 ]");
//	}
//
//	@Test
//	public void testSortDigit1() {
//		// Test #3
//        String[] origNumbers = { "111", "101", "011", "110", "001", "000", "010" };
//        List<String> input = new ArrayList<String>(Arrays.asList(origNumbers));
//
//        assertEquals(BinaryRadixSorter.toString(input), "[ 111 101 011 110 001 000 010 ]");
//
//        List<String> output = BinaryRadixSorter.sortDigit(0, input);
//        assertEquals(BinaryRadixSorter.toString(output), "[ 011 001 000 010 111 101 110 ]");
//	}
//
//	@Test
//	public void testSortDigit2() {
//		// Test #4
//        String[] origNumbers = { "111", "101", "011", "110", "001", "000", "010" };
//        List<String> input = new ArrayList<String>(Arrays.asList(origNumbers));
//
//        assertEquals(BinaryRadixSorter.toString(input), "[ 111 101 011 110 001 000 010 ]");
//
//        List<String> output = BinaryRadixSorter.sortDigit(2, input);
//        assertEquals(BinaryRadixSorter.toString(output), "[ 110 000 010 111 101 011 001 ]");
//	}
//}
