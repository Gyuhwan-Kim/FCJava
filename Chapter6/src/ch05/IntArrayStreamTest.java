package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};

		for(int num:arr) {
			System.out.println(num);
		}
		
		System.out.println();
		IntStream is = Arrays.stream(arr);
		is.forEach(n -> System.out.println(n));

		Arrays.stream(arr).map(c->c*10).forEach(s->System.out.println(s));
		
	}
}
