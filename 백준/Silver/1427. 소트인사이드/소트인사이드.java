
import java.util.Arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		char[] arr = N.toCharArray();
		Arrays.sort(arr);
		int length = arr.length;
		for(int i=0;i<length;i++)
		System.out.print(arr[length-1-i]);
	}

}
