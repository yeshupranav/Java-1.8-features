package com.bean;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestStream {
	public static void main(String[] args) {
		// External Iterations
		List<Integer> values = Arrays.asList(10, 23, 3, 4, 5);
		/*
		 * (iterating the values by using Normal for loop) for (int i = 0; i < 5; i++) {
		 * System.out.println(values.get(i)); }
		 */

		/*
		 * // By using Iterator,if v are update or modified the values v use this for
		 * loop Iterator<Integer> i = values.iterator(); while (i.hasNext()) { // has
		 * next it will be chek the value System.out.println(i.next()); // next it will
		 * be print the value }
		 */

		// By using Enhance for loop v print the all values
		/*
		 * for (Integer integer : values) { System.out.println(integer); }
		 */

		// Internal forloop
		// values.forEach(integer -> System.out.println(integer));
		// values.forEach(integer -> doubleit(integer));
		values.forEach(TestStream::doubleit);
	}

	public static void doubleit(int i) {
		System.out.println(i * 2);
	}
}