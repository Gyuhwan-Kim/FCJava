package ch01;

import java.nio.channels.MembershipKey;
import java.util.Arrays;

public class MinMaxProblem {
	static int minPos2;
	static int maxPos2;
	
	public static void main(String[] args) {

		int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

		int time0 = (int)System.currentTimeMillis();
		int min = numbers[0];
		int max = numbers[0];
		
		int minPos = 0;
		int maxPos = 0;
		
		for(int i = 1; i<numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
				minPos = i+1;
			}
			
			if(max < numbers[i]) {
				max = numbers[i];
				maxPos = i+1;
			}
		}
		
		System.out.println("가장 큰 값은 " + max + "이고, 위치는 " + maxPos + "번째 입니다.");
		System.out.println("가장 작은 값은 " + min + "이고, 위치는 " + minPos + "번째 입니다.");
		
		int time1 = (int)System.currentTimeMillis();
		
		min = Arrays.stream(numbers).min().getAsInt();
		max = Arrays.stream(numbers).max().getAsInt();
		
		int time2 = (int)System.currentTimeMillis();
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] == min) {
				System.out.println("가장 작은 값은 " + min + "이고, 위치는 " + minPos + "번째 입니다.");
			}
			if(numbers[i] == max) {
				System.out.println("가장 큰 값은 " + max + "이고, 위치는 " + maxPos + "번째 입니다.");
			}
			
		}
		
		int time3 = (int)System.currentTimeMillis();
		
		System.out.println("계산 속도 1 : " + (time1-time0) + "ms");
		System.out.println("계산 속도 2 : " + (time2-time1) + "ms");
		System.out.println("계산 속도 3 : " + (time3-time2) + "ms");
	}

}