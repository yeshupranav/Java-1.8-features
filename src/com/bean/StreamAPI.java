package com.bean;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
	public static void main(String[] args) {
		List<Phone> p = new ArrayList<Phone>();
		p.add(new Phone(1, "Apple"));
		p.add(new Phone(2, "Samsung"));
		p.add(new Phone(3, "Lenovo"));
		p.add(new Phone(4, "Nokia"));

		for (Phone phone : p) {

		}

	}

}

class Phone {
	private int id;
	private String name;

	public Phone(int i, String string) {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
