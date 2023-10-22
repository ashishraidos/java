import java.io.*;
import java.util.*;

public class BUBBLESORT {
	public static void bubblesort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean swapped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 34, 67, 75, 87, 56, 76, 9 };
		bubblesort(arr);
		System.out.println("sorted arrays is");
		System.out.println(Arrays.toString(arr));
	}
}
