package com.bean;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInteface {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 2, 3, 4, 5);
		Consumer<Integer> c = new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println(i);
			}
		};
		// Consumer<Integer> c = i -> System.out.println(i);
		values.forEach(i -> System.out.println(i));
	}

}
